package com.plusls.MasaGadget.gui;

//#if MC > 11502
import com.mojang.blaze3d.vertex.PoseStack;
//#endif

public interface IDropdownRenderer {
    //#if MC > 11502
    void masa_gad_get$renderHovered(PoseStack poseStack, int mouseX, int mouseY);
    //#else
    //$$ void masa_gad_get$renderHovered(int mouseX, int mouseY);
    //#endif
}
