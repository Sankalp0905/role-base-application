package com.role.controller;

import jakarta.annotation.security.RolesAllowed;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/admin")
public class AdminResource {

    @GET
    @RolesAllowed("ADMIN")  // Only users with 'ADMIN' role can access
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAdminDashboard() {
        // Logic for admin dashboard
        return Response.ok("Admin dashboard").build();
    }
}
