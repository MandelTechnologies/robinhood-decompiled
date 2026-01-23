package com.robinhood.android.internalassettransfers.review;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.internalassettransfers.presubmissionwarn.Button;
import com.robinhood.android.internalassettransfers.presubmissionwarn.PresubmissionCheckAlertSheets2;
import com.robinhood.android.internalassettransfers.presubmissionwarn.PresubmissionChecksAlertSheet;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertSheet;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InternalAssetTransferReviewAlertSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewAlertSheetKt$PresubmitAlertSheet$2$2, reason: use source file name */
/* loaded from: classes10.dex */
final class InternalAssetTransferReviewAlertSheet3 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
    final /* synthetic */ Function2<RhModalBottomSheet5, PresubmissionCheckAlertSheets2, Unit> $actionHandler;
    final /* synthetic */ PresubmissionChecksAlertSheet $currentAlert;

    /* JADX WARN: Multi-variable type inference failed */
    InternalAssetTransferReviewAlertSheet3(PresubmissionChecksAlertSheet presubmissionChecksAlertSheet, Function2<? super RhModalBottomSheet5, ? super PresubmissionCheckAlertSheets2, Unit> function2) {
        this.$currentAlert = presubmissionChecksAlertSheet;
        this.$actionHandler = function2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
        invoke(rhModalBottomSheet5, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(final RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
        int i2;
        BentoAlertButton bentoAlertButton;
        Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? composer.changed(RhModalBottomSheet) : composer.changedInstance(RhModalBottomSheet) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1352456329, i2, -1, "com.robinhood.android.internalassettransfers.review.PresubmitAlertSheet.<anonymous>.<anonymous> (InternalAssetTransferReviewAlertSheet.kt:92)");
        }
        StringResource title = this.$currentAlert.getTitle();
        int i3 = StringResource.$stable;
        String string2 = StringResource2.getString(title, composer, i3);
        String string3 = StringResource2.getString(this.$currentAlert.getSubtitleMarkdown(), composer, i3);
        String string4 = StringResource2.getString(this.$currentAlert.getPrimaryButton().getText(), composer, i3);
        composer.startReplaceGroup(-1746271574);
        int i4 = i2 & 14;
        boolean z = false;
        boolean zChanged = composer.changed(this.$actionHandler) | (i4 == 4 || ((i2 & 8) != 0 && composer.changedInstance(RhModalBottomSheet))) | composer.changedInstance(this.$currentAlert);
        final Function2<RhModalBottomSheet5, PresubmissionCheckAlertSheets2, Unit> function2 = this.$actionHandler;
        final PresubmissionChecksAlertSheet presubmissionChecksAlertSheet = this.$currentAlert;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewAlertSheetKt$PresubmitAlertSheet$2$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InternalAssetTransferReviewAlertSheet3.invoke$lambda$1$lambda$0(function2, RhModalBottomSheet, presubmissionChecksAlertSheet);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoAlertButton bentoAlertButton2 = new BentoAlertButton(string4, (Function0) objRememberedValue);
        final Button secondaryButton = this.$currentAlert.getSecondaryButton();
        composer.startReplaceGroup(1664575681);
        if (secondaryButton == null) {
            bentoAlertButton = null;
        } else {
            final Function2<RhModalBottomSheet5, PresubmissionCheckAlertSheets2, Unit> function22 = this.$actionHandler;
            String string5 = StringResource2.getString(secondaryButton.getText(), composer, i3);
            composer.startReplaceGroup(-1746271574);
            boolean zChanged2 = composer.changed(function22);
            if (i4 == 4 || ((i2 & 8) != 0 && composer.changedInstance(RhModalBottomSheet))) {
                z = true;
            }
            boolean zChangedInstance = zChanged2 | z | composer.changedInstance(secondaryButton);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewAlertSheetKt$PresubmitAlertSheet$2$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InternalAssetTransferReviewAlertSheet3.invoke$lambda$4$lambda$3$lambda$2(function22, RhModalBottomSheet, secondaryButton);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            bentoAlertButton = new BentoAlertButton(string5, (Function0) objRememberedValue2);
        }
        composer.endReplaceGroup();
        ServerToBentoAssetMapper3 pictogramAsset = this.$currentAlert.getPictogramAsset();
        int i5 = BentoAlertButton.$stable;
        BentoAlertSheet.BentoAlertSheet(string2, string3, bentoAlertButton2, bentoAlertButton, pictogramAsset, null, composer, (i5 << 6) | (i5 << 9), 32);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function2 function2, RhModalBottomSheet5 rhModalBottomSheet5, PresubmissionChecksAlertSheet presubmissionChecksAlertSheet) {
        function2.invoke(rhModalBottomSheet5, presubmissionChecksAlertSheet.getPrimaryButton().getAction());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3$lambda$2(Function2 function2, RhModalBottomSheet5 rhModalBottomSheet5, Button button) {
        function2.invoke(rhModalBottomSheet5, button.getAction());
        return Unit.INSTANCE;
    }
}
