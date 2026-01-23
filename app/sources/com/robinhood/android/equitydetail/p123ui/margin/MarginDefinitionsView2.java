package com.robinhood.android.equitydetail.p123ui.margin;

import android.R;
import android.content.Context;
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionTextView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.models.p320db.MarginRequirements;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.utils.p409ui.color.ThemeColors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MarginDefinitionsView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equitydetail.ui.margin.MarginDefinitionsView$SdpContent$1$2$1, reason: use source file name */
/* loaded from: classes3.dex */
final class MarginDefinitionsView2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MarginRequirements.MarginFieldWithDefinition $field;

    MarginDefinitionsView2(MarginRequirements.MarginFieldWithDefinition marginFieldWithDefinition) {
        this.$field = marginFieldWithDefinition;
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
            ComposerKt.traceEventStart(-1954119497, i, -1, "com.robinhood.android.equitydetail.ui.margin.MarginDefinitionsView.SdpContent.<anonymous>.<anonymous>.<anonymous> (MarginDefinitionsView.kt:148)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.equitydetail.ui.margin.MarginDefinitionsView$SdpContent$1$2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginDefinitionsView2.invoke$lambda$1$lambda$0((Context) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(this.$field);
        final MarginRequirements.MarginFieldWithDefinition marginFieldWithDefinition = this.$field;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equitydetail.ui.margin.MarginDefinitionsView$SdpContent$1$2$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MarginDefinitionsView2.invoke$lambda$5$lambda$4(marginFieldWithDefinition, (RdsInlineDefinitionTextView) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        AndroidView_androidKt.AndroidView(function1, null, (Function1) objRememberedValue2, composer, 6, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RdsInlineDefinitionTextView invoke$lambda$1$lambda$0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new RdsInlineDefinitionTextView(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(MarginRequirements.MarginFieldWithDefinition marginFieldWithDefinition, RdsInlineDefinitionTextView inlineDefinitionTextView) {
        Intrinsics.checkNotNullParameter(inlineDefinitionTextView, "inlineDefinitionTextView");
        ScarletManager2.overrideStyle$default(inlineDefinitionTextView, new ThemedResourceReference(ResourceType.STYLE.INSTANCE, C20690R.attr.textAppearanceRegularMedium), false, 2, null);
        inlineDefinitionTextView.setText(marginFieldWithDefinition.getName());
        inlineDefinitionTextView.setMaxLines(2);
        inlineDefinitionTextView.setLineSpacing(4.0f, 1.0f);
        Context context = inlineDefinitionTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        inlineDefinitionTextView.setLinkTextColor(ThemeColors.getThemeColor(context, R.attr.textColorSecondary));
        Context context2 = inlineDefinitionTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        inlineDefinitionTextView.setHighlightColor(ThemeColors.getThemeColor(context2, C20690R.attr.colorBackground2));
        String definition = marginFieldWithDefinition.getDefinition();
        if (definition != null) {
            inlineDefinitionTextView.setInlineDefinitionSpan(0, marginFieldWithDefinition.getName().length(), definition);
        }
        return Unit.INSTANCE;
    }
}
