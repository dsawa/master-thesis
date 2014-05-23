describe("Group.create method") {
    it("should save new group in database") {
      val newTestGroup = Group(new ObjectId, "New test group")
      When("Group is being inserted in database")
      Group.create(newTestGroup)
      Then("collection count increases")
      collection.count() should equal(beforeCount + 1)
      And("We can find that group in database")
      val optionGroup = Group.findOneById(newTestGroup.id)
    }
}
