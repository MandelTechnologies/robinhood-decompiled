package com.robinhood.android.gold.downgrade;

import android.content.Context;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import coil.compose.AsyncImagePainter;
import coil.compose.SingletonAsyncImagePainter;
import com.robinhood.android.gold.subscription.api.ApiGenericCta;
import com.robinhood.android.gold.subscription.api.ApiGoldDowngradeConfirmation;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.mediaservice.ImageDensityUrl;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GoldDowngradeConfirmationComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.downgrade.GoldDowngradeConfirmationComposableKt$DowngradeConfirmation$1$1, reason: use source file name */
/* loaded from: classes10.dex */
final class GoldDowngradeConfirmationComposable2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ ApiGoldDowngradeConfirmation $this_with;

    GoldDowngradeConfirmationComposable2(ApiGoldDowngradeConfirmation apiGoldDowngradeConfirmation, Modifier modifier) {
        this.$this_with = apiGoldDowngradeConfirmation;
        this.$modifier = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-533428513, i, -1, "com.robinhood.android.gold.downgrade.DowngradeConfirmation.<anonymous>.<anonymous> (GoldDowngradeConfirmationComposable.kt:97)");
        }
        final SduiActionHandler sduiActionHandlerCurrentActionHandler = SduiActionHandler3.currentActionHandler(composer, 0);
        final Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Function0 function0 = null;
        AsyncImagePainter asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg = SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageDensityUrl(this.$this_with.getAssetPath(), null, 2, null).getImageDensityUrl(ContextsUiExtensions.getDensitySpec((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()))), null, null, null, 0, null, composer, 0, 62);
        String title = this.$this_with.getTitle();
        String descriptionMarkdown = this.$this_with.getDescriptionMarkdown();
        String text = this.$this_with.getPrimaryCta().getText();
        composer.startReplaceGroup(-1746271574);
        boolean zChangedInstance = composer.changedInstance(sduiActionHandlerCurrentActionHandler) | composer.changedInstance(context) | composer.changedInstance(this.$this_with);
        final ApiGoldDowngradeConfirmation apiGoldDowngradeConfirmation = this.$this_with;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.downgrade.GoldDowngradeConfirmationComposableKt$DowngradeConfirmation$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GoldDowngradeConfirmationComposable2.invoke$lambda$1$lambda$0(sduiActionHandlerCurrentActionHandler, context, apiGoldDowngradeConfirmation);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function02 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        ApiGenericCta secondaryCta = this.$this_with.getSecondaryCta();
        String text2 = secondaryCta != null ? secondaryCta.getText() : null;
        ApiGenericCta secondaryCta2 = this.$this_with.getSecondaryCta();
        final GenericAction action = secondaryCta2 != null ? secondaryCta2.getAction() : null;
        composer.startReplaceGroup(-1523664952);
        if (action != null) {
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance2 = composer.changedInstance(sduiActionHandlerCurrentActionHandler) | composer.changedInstance(context) | composer.changedInstance(action);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.gold.downgrade.GoldDowngradeConfirmationComposableKt$DowngradeConfirmation$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GoldDowngradeConfirmationComposable2.invoke$lambda$4$lambda$3$lambda$2(sduiActionHandlerCurrentActionHandler, context, action);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            function0 = (Function0) objRememberedValue2;
            composer.endReplaceGroup();
        }
        composer.endReplaceGroup();
        GoldDowngradeConfirmationComposable.BaseDowngradeConfirmation(asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg, title, descriptionMarkdown, text, function02, text2, function0, this.$modifier, composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SduiActionHandler sduiActionHandler, Context context, ApiGoldDowngradeConfirmation apiGoldDowngradeConfirmation) {
        GoldDowngradeConfirmationComposable.handleAndFinishIfDeeplink(sduiActionHandler, context, apiGoldDowngradeConfirmation.getPrimaryCta().getAction());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3$lambda$2(SduiActionHandler sduiActionHandler, Context context, GenericAction genericAction) {
        GoldDowngradeConfirmationComposable.handleAndFinishIfDeeplink(sduiActionHandler, context, genericAction);
        return Unit.INSTANCE;
    }
}
