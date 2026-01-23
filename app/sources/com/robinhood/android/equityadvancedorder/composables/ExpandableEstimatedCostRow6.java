package com.robinhood.android.equityadvancedorder.composables;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ExpandableEstimatedCostRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equityadvancedorder.composables.ExpandableEstimatedCostRowKt$ExpandableEstimatedCostRow$5$1$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class ExpandableEstimatedCostRow6 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ UserInteractionEventDescriptor $breakdownDescriptor;
    final /* synthetic */ SnapshotState<Boolean> $expanded$delegate;

    ExpandableEstimatedCostRow6(UserInteractionEventDescriptor userInteractionEventDescriptor, SnapshotState<Boolean> snapshotState) {
        this.$breakdownDescriptor = userInteractionEventDescriptor;
        this.$expanded$delegate = snapshotState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1784442694, i, -1, "com.robinhood.android.equityadvancedorder.composables.ExpandableEstimatedCostRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ExpandableEstimatedCostRow.kt:133)");
        }
        boolean zExpandableEstimatedCostRow$lambda$5 = ExpandableEstimatedCostRow3.ExpandableEstimatedCostRow$lambda$5(this.$expanded$delegate);
        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), this.$breakdownDescriptor, true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.equityadvancedorder.composables.ExpandableEstimatedCostRowKt$ExpandableEstimatedCostRow$5$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ExpandableEstimatedCostRow6.invoke$lambda$1$lambda$0((SemanticsPropertyReceiver) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        ExpandableEstimatedCostRow3.ExpandCaretIcon(zExpandableEstimatedCostRow$lambda$5, SemanticsModifier6.semantics$default(modifierAutoLogEvents$default, false, (Function1) objRememberedValue, 1, null), composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setTestTag(semantics, ExpandableEstimatedCostRow3.EXPAND_CARET_TAG);
        SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
        return Unit.INSTANCE;
    }
}
