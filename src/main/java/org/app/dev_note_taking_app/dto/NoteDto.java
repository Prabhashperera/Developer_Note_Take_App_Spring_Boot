package org.app.dev_note_taking_app.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@ToString
public class NoteDto {
    private int noteId;

    @NotBlank(message = "Title is required")
    @Size(max = 100, message = "Title can't exceed 100 characters")
    private String title;

    @NotBlank(message = "Content cannot be empty")
    private String content;
    private String createdDate;
    private String lastModifiedData;
    private String category;
}
