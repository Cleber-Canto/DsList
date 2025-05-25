package com.devsuperior.dslist.dto;

public class ReplacementDTO {

    private Integer sourceIndex;
    private Integer destinationIndex;

    public Integer getSourceIndex() {
        return sourceIndex != null ? sourceIndex : 0; // Define um valor padrão caso seja null
    }

    public void setSourceIndex(Integer sourceIndex) {
        this.sourceIndex = sourceIndex;
    }

    public Integer getDestinationIndex() {
        return destinationIndex != null ? destinationIndex : 0; // Define um valor padrão caso seja null
    }

    public void setDestinationIndex(Integer destinationIndex) {
        this.destinationIndex = destinationIndex;
    }
}
