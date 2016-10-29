package ru.test;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path(value = "people")
public class MainRest {

    @Inject
    private PeopleService peopleService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public People getPeople() {
        return peopleService.getPeople();
    }
}
