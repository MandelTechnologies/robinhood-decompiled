package com.robinhood.tooltips;

import android.graphics.Rect;
import com.robinhood.tooltips.TooltipManager;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: TooltipManager.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J3\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u000e¢\u0006\u0002\b\u000fH&J \u0010\u0010\u001a\u00020\u00032\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00030\u000eH&J\b\u0010\u0012\u001a\u00020\u0003H&J\b\u0010\u0013\u001a\u00020\u0003H&J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\nH&¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/tooltips/TooltipManager;", "", "addTooltip", "", "forceDisplay", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/tooltips/TooltipData;", "hasTooltip", "id", "", "removeTooltip", "updateTooltip", "mutator", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "dismissActiveTooltip", "onRemoved", "resume", "pause", "setComposeViewCanvas", "tag", "bounds", "Landroid/graphics/Rect;", "removeComposeViewCanvas", "lib-design-system-tooltips_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface TooltipManager {
    void addTooltip(boolean forceDisplay, TooltipData data);

    void dismissActiveTooltip(Function1<? super TooltipData, Unit> onRemoved);

    boolean hasTooltip(String id);

    void pause();

    void removeComposeViewCanvas(String tag);

    void removeTooltip(String id);

    void resume();

    void setComposeViewCanvas(String tag, Rect bounds);

    void updateTooltip(String id, boolean forceDisplay, Function1<? super TooltipData, TooltipData> mutator);

    /* compiled from: TooltipManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void addTooltip$default(TooltipManager tooltipManager, boolean z, TooltipData tooltipData, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addTooltip");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            tooltipManager.addTooltip(z, tooltipData);
        }

        public static /* synthetic */ void updateTooltip$default(TooltipManager tooltipManager, String str, boolean z, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateTooltip");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            tooltipManager.updateTooltip(str, z, function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void dismissActiveTooltip$default(TooltipManager tooltipManager, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dismissActiveTooltip");
            }
            if ((i & 1) != 0) {
                function1 = new Function1() { // from class: com.robinhood.tooltips.TooltipManager$DefaultImpls$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return TooltipManager.DefaultImpls.dismissActiveTooltip$lambda$0((TooltipData) obj2);
                    }
                };
            }
            tooltipManager.dismissActiveTooltip(function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Unit dismissActiveTooltip$lambda$0(TooltipData tooltipData) {
            return Unit.INSTANCE;
        }
    }
}
