package com.robinhood.iac.alertsheet.p295ui;

import com.robinhood.android.libdesignsystem.serverui.ServerToBentoColorMapper;
import com.robinhood.models.serverdriven.p347db.ThemedColor;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import kotlin.Metadata;

/* compiled from: IacAlertSheetViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0002H\u0002\u001a.\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0002H\u0002¨\u0006\t"}, m3636d2 = {"mapColor", "Lcom/robinhood/scarlet/util/resource/ResourceReference;", "", "Lcom/robinhood/android/libdesignsystem/serverui/ServerToBentoColorMapper;", "themedColor", "Lcom/robinhood/models/serverdriven/db/ThemedColor;", "fallback", "fallbackDay", "fallbackNight", "lib-iac-alert-sheet_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.iac.alertsheet.ui.IacAlertSheetViewStateKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class IacAlertSheetViewState2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final ResourceReferences4<Integer> mapColor(ServerToBentoColorMapper serverToBentoColorMapper, ThemedColor themedColor, int i) {
        if (themedColor != null) {
            ResourceReferences4<Integer> resourceReferences4MapDayNightSelectorServerColor = serverToBentoColorMapper.mapDayNightSelectorServerColor(themedColor.getLight(), themedColor.getDark());
            return resourceReferences4MapDayNightSelectorServerColor == null ? new ThemedResourceReference(ResourceType.COLOR.INSTANCE, i) : resourceReferences4MapDayNightSelectorServerColor;
        }
        return new ThemedResourceReference(ResourceType.COLOR.INSTANCE, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ResourceReferences4<Integer> mapColor(ServerToBentoColorMapper serverToBentoColorMapper, ThemedColor themedColor, int i, int i2) {
        return serverToBentoColorMapper.mapDayNightSelectorServerColor(themedColor.getLight(), themedColor.getDark(), i, i2);
    }
}
