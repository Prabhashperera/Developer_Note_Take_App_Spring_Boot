package org.app.dev_note_taking_app.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@ToString
public class NoteDto {
    private int noteId;
    private String title;
    private String content;
    private String createdDate;
    private String lastModifiedData;
    private String category;
}
