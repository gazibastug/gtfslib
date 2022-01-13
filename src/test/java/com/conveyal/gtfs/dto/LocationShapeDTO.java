package com.conveyal.gtfs.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * DTO used to model expected {@link com.conveyal.gtfs.model.LocationShape} JSON structure for the editor. NOTE:
 * reference types (e.g., Integer and Double) are used here in order to model null/empty values in JSON object.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LocationShapeDTO {
    public int id;
    public String location_id;
    public String geometry_id;
    public Double geometry_pt_lat;
    public Double geometry_pt_lon;
}
