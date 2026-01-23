package com.robinhood.android.cortex.digest.asset;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.cortex.digest.asset.AssetDigestFeedbackComposable;
import com.robinhood.android.cortex.digest.common.feedback.DigestFeedbackSheetComposable;
import com.robinhood.android.cortex.digest.common.feedback.DigestFeedbackType;
import com.robinhood.android.cortex.models.asset.AssetType3;
import com.robinhood.android.cortex.models.feedback.DigestFeedback;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AssetDigestFeedbackComposable.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aU\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u0010H\u0001¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"AssetDigestFeedbackComposable", "", "Lcom/robinhood/android/common/composebottomsheet/RhModalBottomSheetScope;", "instrumentType", "Lcom/robinhood/android/cortex/models/asset/CopilotInstrumentType;", "instrumentId", "Ljava/util/UUID;", "digestId", "", "feedbackType", "Lcom/robinhood/android/cortex/digest/common/feedback/DigestFeedbackType;", "feedback", "Lcom/robinhood/android/cortex/models/feedback/DigestFeedback;", "loading", "", "onReasonsSubmitted", "Lkotlin/Function1;", "(Lcom/robinhood/android/common/composebottomsheet/RhModalBottomSheetScope;Lcom/robinhood/android/cortex/models/asset/CopilotInstrumentType;Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/android/cortex/digest/common/feedback/DigestFeedbackType;Lcom/robinhood/android/cortex/models/feedback/DigestFeedback;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "feature-cortex-digest-asset_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestFeedbackComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class AssetDigestFeedbackComposable {

    /* compiled from: AssetDigestFeedbackComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestFeedbackComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AssetType3.values().length];
            try {
                iArr[AssetType3.STOCKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AssetType3.CRYPTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AssetDigestFeedbackComposable$lambda$0(RhModalBottomSheet5 rhModalBottomSheet5, AssetType3 assetType3, UUID uuid, String str, DigestFeedbackType digestFeedbackType, DigestFeedback digestFeedback, boolean z, Function1 function1, int i, Composer composer, int i2) {
        AssetDigestFeedbackComposable(rhModalBottomSheet5, assetType3, uuid, str, digestFeedbackType, digestFeedback, z, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void AssetDigestFeedbackComposable(final RhModalBottomSheet5 rhModalBottomSheet5, final AssetType3 instrumentType, final UUID instrumentId, final String digestId, final DigestFeedbackType feedbackType, final DigestFeedback feedback, final boolean z, final Function1<? super DigestFeedback, Unit> onReasonsSubmitted, Composer composer, final int i) {
        int i2;
        Screen.Name name;
        Composer composer2;
        Intrinsics.checkNotNullParameter(rhModalBottomSheet5, "<this>");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(digestId, "digestId");
        Intrinsics.checkNotNullParameter(feedbackType, "feedbackType");
        Intrinsics.checkNotNullParameter(feedback, "feedback");
        Intrinsics.checkNotNullParameter(onReasonsSubmitted, "onReasonsSubmitted");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1361743452);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(rhModalBottomSheet5) : composerStartRestartGroup.changedInstance(rhModalBottomSheet5) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(instrumentType.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(instrumentId) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(digestId) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(feedbackType.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(feedback) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onReasonsSubmitted) ? 8388608 : 4194304;
        }
        if ((4793491 & i2) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1361743452, i2, -1, "com.robinhood.android.cortex.digest.asset.AssetDigestFeedbackComposable (AssetDigestFeedbackComposable.kt:24)");
            }
            int i3 = WhenMappings.$EnumSwitchMapping$0[instrumentType.ordinal()];
            if (i3 == 1) {
                name = Screen.Name.CORTEX_SDP_DIGEST_FEEDBACK;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                name = Screen.Name.CORTEX_CDP_DIGEST_FEEDBACK;
            }
            Screen.Name name2 = name;
            String string2 = instrumentId.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, new Screen(name2, digestId, string2, null, 8, null), null, null, null, null, 61, null);
            composer2 = composerStartRestartGroup;
            AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(666175385, true, new C120111(feedback, feedbackType, z, onReasonsSubmitted, rhModalBottomSheet5), composer2, 54), composer2, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestFeedbackComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AssetDigestFeedbackComposable.AssetDigestFeedbackComposable$lambda$0(rhModalBottomSheet5, instrumentType, instrumentId, digestId, feedbackType, feedback, z, onReasonsSubmitted, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: AssetDigestFeedbackComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestFeedbackComposableKt$AssetDigestFeedbackComposable$1 */
    static final class C120111 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ DigestFeedback $feedback;
        final /* synthetic */ DigestFeedbackType $feedbackType;
        final /* synthetic */ boolean $loading;
        final /* synthetic */ Function1<DigestFeedback, Unit> $onReasonsSubmitted;
        final /* synthetic */ RhModalBottomSheet5 $this_AssetDigestFeedbackComposable;

        /* JADX WARN: Multi-variable type inference failed */
        C120111(DigestFeedback digestFeedback, DigestFeedbackType digestFeedbackType, boolean z, Function1<? super DigestFeedback, Unit> function1, RhModalBottomSheet5 rhModalBottomSheet5) {
            this.$feedback = digestFeedback;
            this.$feedbackType = digestFeedbackType;
            this.$loading = z;
            this.$onReasonsSubmitted = function1;
            this.$this_AssetDigestFeedbackComposable = rhModalBottomSheet5;
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
                ComposerKt.traceEventStart(666175385, i, -1, "com.robinhood.android.cortex.digest.asset.AssetDigestFeedbackComposable.<anonymous> (AssetDigestFeedbackComposable.kt:37)");
            }
            Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(Modifier.INSTANCE, null, 1, null);
            DigestFeedback digestFeedback = this.$feedback;
            DigestFeedbackType digestFeedbackType = this.$feedbackType;
            boolean z = this.$loading;
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$onReasonsSubmitted) | composer.changedInstance(this.$this_AssetDigestFeedbackComposable);
            final Function1<DigestFeedback, Unit> function1 = this.$onReasonsSubmitted;
            final RhModalBottomSheet5 rhModalBottomSheet5 = this.$this_AssetDigestFeedbackComposable;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestFeedbackComposableKt$AssetDigestFeedbackComposable$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AssetDigestFeedbackComposable.C120111.invoke$lambda$1$lambda$0(function1, rhModalBottomSheet5, (DigestFeedback) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            DigestFeedbackSheetComposable.DigestFeedbackSheetComposable(digestFeedback, digestFeedbackType, z, (Function1) objRememberedValue, modifierLogScreenTransitions$default, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function1 function1, RhModalBottomSheet5 rhModalBottomSheet5, DigestFeedback it) {
            Intrinsics.checkNotNullParameter(it, "it");
            function1.invoke(it);
            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
            return Unit.INSTANCE;
        }
    }
}
