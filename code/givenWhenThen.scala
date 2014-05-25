describe("Group.create method") {
    it("should save new group in database") {
      Given("new group instance")
      val newTestGroup = Group(new ObjectId, "New test group")
      When("group is being inserted in database")
      Group.create(newTestGroup)
      Then("collection count increases")
      collection.count() should equal(beforeCount + 1)
      And("We can find that group in database")
      val optionGroup = Group.findOneById(newTestGroup.id)
    }
}
