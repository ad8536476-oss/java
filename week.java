Yes. You can build this entirely in **JavaFX Scene Builder**, without writing Java code.

 ## JavaFX GUI layout

 Create a simple window with this structure:

```
┌──────────────────────────────────────┐
│                                      │
│          Hello, JavaFX!              │
│              (Label)                 │
│                                      │
│          ┌────────────────┐          │
│          │                │          │
│          │     IMAGE      │          │
│          │                │          │
│          └────────────────┘          │
│             (ImageView)              │
│                                      │
└──────────────────────────────────────┘
```

 ### Scene Builder steps

 1. Create a new **JavaFX FXML** document.
2. Set the root container to **VBox**.
3. Set:
   - **Spacing:** `20`
   - **Alignment:** `CENTER`
   - **Padding:** `20`
4. Drag a **Label** into the VBox.
   - Set **Text:** `Hello, JavaFX!`
   - Set **Font Size:** around `24`
5. Drag an **ImageView** below the Label.
6. Select the ImageView and set:
   - **Fit Width:** `250`
   - **Fit Height:** `180`
   - **Preserve Ratio:** `true`
7. In the ImageView's **Image** property, select an image from your project resources.
8. Set the Scene's preferred size to approximately **400 × 350**.

 The resulting JavaFX interface will display the **text in the Label** and the **selected picture in the ImageView**, with no Java code required for the visual design.
