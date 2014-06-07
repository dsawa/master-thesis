solutionsCollection.find(
    MongoDBObject("result.mark" -> MongoDBObject("$gte" -> 80)))