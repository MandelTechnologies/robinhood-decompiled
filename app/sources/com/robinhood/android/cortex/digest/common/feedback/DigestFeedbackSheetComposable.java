package com.robinhood.android.cortex.digest.common.feedback;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.cortex.digest.common.C12073R;
import com.robinhood.android.cortex.digest.common.feedback.DigestFeedbackSheetComposable;
import com.robinhood.android.cortex.models.feedback.DigestFeedback;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlerts2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableMap;

/* compiled from: DigestFeedbackSheetComposable.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aC\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"DigestFeedbackSheetComposable", "", "feedback", "Lcom/robinhood/android/cortex/models/feedback/DigestFeedback;", "feedbackType", "Lcom/robinhood/android/cortex/digest/common/feedback/DigestFeedbackType;", "loading", "", "onReasonsSubmitted", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/cortex/models/feedback/DigestFeedback;Lcom/robinhood/android/cortex/digest/common/feedback/DigestFeedbackType;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-cortex-digest-common_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.cortex.digest.common.feedback.DigestFeedbackSheetComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class DigestFeedbackSheetComposable {

    /* compiled from: DigestFeedbackSheetComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cortex.digest.common.feedback.DigestFeedbackSheetComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DigestFeedbackType.values().length];
            try {
                iArr[DigestFeedbackType.LIKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DigestFeedbackType.DISLIKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DigestFeedbackSheetComposable$lambda$7(DigestFeedback digestFeedback, DigestFeedbackType digestFeedbackType, boolean z, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        DigestFeedbackSheetComposable(digestFeedback, digestFeedbackType, z, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DigestFeedbackSheetComposable(final DigestFeedback feedback, final DigestFeedbackType feedbackType, final boolean z, final Function1<? super DigestFeedback, Unit> onReasonsSubmitted, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean zChanged;
        Object objRememberedValue;
        final SnapshotStateMap snapshotStateMap;
        int i5;
        int i6;
        boolean zChanged2;
        Object objRememberedValue2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(feedback, "feedback");
        Intrinsics.checkNotNullParameter(feedbackType, "feedbackType");
        Intrinsics.checkNotNullParameter(onReasonsSubmitted, "onReasonsSubmitted");
        Composer composerStartRestartGroup = composer.startRestartGroup(2061134211);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(feedback) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(feedbackType.ordinal()) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onReasonsSubmitted) ? 2048 : 1024;
        }
        int i7 = i2 & 16;
        if (i7 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i4 = i3;
            if ((i4 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2061134211, i4, -1, "com.robinhood.android.cortex.digest.common.feedback.DigestFeedbackSheetComposable (DigestFeedbackSheetComposable.kt:25)");
                }
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(feedback);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateMapOf();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotStateMap = (SnapshotStateMap) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                i5 = WhenMappings.$EnumSwitchMapping$0[feedbackType.ordinal()];
                if (i5 != 1) {
                    i6 = C12073R.string.cortex_digest_feedback_title_like;
                } else {
                    if (i5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i6 = C12073R.string.cortex_digest_feedback_title_dislike;
                }
                String strStringResource = StringResources_androidKt.stringResource(i6, composerStartRestartGroup, 0);
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, "submit", null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null);
                String strStringResource2 = StringResources_androidKt.stringResource(C12073R.string.cortex_digest_feedback_submit, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChanged2 = ((i4 & 112) != 32) | composerStartRestartGroup.changed(snapshotStateMap) | composerStartRestartGroup.changedInstance(feedback) | ((i4 & 7168) != 2048);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.cortex.digest.common.feedback.DigestFeedbackSheetComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DigestFeedbackSheetComposable.DigestFeedbackSheetComposable$lambda$6$lambda$5(snapshotStateMap, feedback, feedbackType, onReasonsSubmitted);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                Modifier modifier5 = modifier4;
                BentoAlerts2.AlertContent(modifier5, null, strStringResource, null, CollectionsKt.listOf(new BentoAlertButton(strStringResource2, (Function0) objRememberedValue2, modifierAutoLogEvents$default, null, null, z, 24, null)), false, ComposableLambda3.rememberComposableLambda(499818771, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.common.feedback.DigestFeedbackSheetComposableKt.DigestFeedbackSheetComposable.2

                    /* compiled from: DigestFeedbackSheetComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.cortex.digest.common.feedback.DigestFeedbackSheetComposableKt$DigestFeedbackSheetComposable$2$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ DigestFeedback $feedback;
                        final /* synthetic */ DigestFeedbackType $feedbackType;
                        final /* synthetic */ boolean $loading;
                        final /* synthetic */ SnapshotStateMap<String, Boolean> $selectedReasons;

                        /* compiled from: DigestFeedbackSheetComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        /* renamed from: com.robinhood.android.cortex.digest.common.feedback.DigestFeedbackSheetComposableKt$DigestFeedbackSheetComposable$2$1$WhenMappings */
                        public /* synthetic */ class WhenMappings {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[DigestFeedbackType.values().length];
                                try {
                                    iArr[DigestFeedbackType.LIKE.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[DigestFeedbackType.DISLIKE.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        AnonymousClass1(DigestFeedbackType digestFeedbackType, DigestFeedback digestFeedback, SnapshotStateMap<String, Boolean> snapshotStateMap, boolean z) {
                            this.$feedbackType = digestFeedbackType;
                            this.$feedback = digestFeedback;
                            this.$selectedReasons = snapshotStateMap;
                            this.$loading = z;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$2$lambda$1$lambda$0(SnapshotStateMap snapshotStateMap, DigestFeedback.Reason reason) {
                            snapshotStateMap.put(reason.getDisplayTitle(), Boolean.valueOf(!(((Boolean) snapshotStateMap.get(reason.getDisplayTitle())) != null ? r1.booleanValue() : reason.getSelected())));
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer, int i) {
                            List<DigestFeedback.Reason> likeReasons;
                            Composer composer2 = composer;
                            if ((i & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(930303134, i, -1, "com.robinhood.android.cortex.digest.common.feedback.DigestFeedbackSheetComposable.<anonymous>.<anonymous> (DigestFeedbackSheetComposable.kt:78)");
                            }
                            int i2 = WhenMappings.$EnumSwitchMapping$0[this.$feedbackType.ordinal()];
                            if (i2 == 1) {
                                likeReasons = this.$feedback.getLikeReasons();
                            } else {
                                if (i2 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                likeReasons = this.$feedback.getDislikeReasons();
                            }
                            final SnapshotStateMap<String, Boolean> snapshotStateMap = this.$selectedReasons;
                            boolean z = this.$loading;
                            for (final DigestFeedback.Reason reason : likeReasons) {
                                BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.Checkbox;
                                String displayTitle = reason.getDisplayTitle();
                                Boolean bool = snapshotStateMap.get(reason.getDisplayTitle());
                                BentoSelectionRowState bentoSelectionRowState = new BentoSelectionRowState(type2, displayTitle, bool != null ? bool.booleanValue() : reason.getSelected(), (BentoBaseRowState.Text) null, !z, false, (BentoSelectionRowState.IconPosition) null, true, false, (ImmutableMap) null, (Function0) null, 1896, (DefaultConstructorMarker) null);
                                composer2.startReplaceGroup(-1633490746);
                                boolean zChanged = composer2.changed(snapshotStateMap) | composer2.changedInstance(reason);
                                Object objRememberedValue = composer2.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.cortex.digest.common.feedback.DigestFeedbackSheetComposableKt$DigestFeedbackSheetComposable$2$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return DigestFeedbackSheetComposable.C120752.AnonymousClass1.invoke$lambda$2$lambda$1$lambda$0(snapshotStateMap, reason);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue);
                                }
                                composer2.endReplaceGroup();
                                BentoSelectionRow2.BentoSelectionRow(null, bentoSelectionRowState, (Function0) objRememberedValue, composer2, BentoSelectionRowState.$stable << 3, 1);
                                composer2 = composer;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i8) {
                        if ((i8 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(499818771, i8, -1, "com.robinhood.android.cortex.digest.common.feedback.DigestFeedbackSheetComposable.<anonymous> (DigestFeedbackSheetComposable.kt:77)");
                        }
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(930303134, true, new AnonymousClass1(feedbackType, feedback, snapshotStateMap, z), composer3, 54), composer3, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, ((i4 >> 12) & 14) | 1572864 | (BentoAlertButton.$stable << 12), 42);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cortex.digest.common.feedback.DigestFeedbackSheetComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DigestFeedbackSheetComposable.DigestFeedbackSheetComposable$lambda$7(feedback, feedbackType, z, onReasonsSubmitted, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 9363) == 9362) {
            if (i7 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChanged = composerStartRestartGroup.changed(feedback);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue = SnapshotStateKt.mutableStateMapOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                snapshotStateMap = (SnapshotStateMap) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                i5 = WhenMappings.$EnumSwitchMapping$0[feedbackType.ordinal()];
                if (i5 != 1) {
                }
                String strStringResource3 = StringResources_androidKt.stringResource(i6, composerStartRestartGroup, 0);
                Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, "submit", null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null);
                String strStringResource22 = StringResources_androidKt.stringResource(C12073R.string.cortex_digest_feedback_submit, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChanged2 = ((i4 & 112) != 32) | composerStartRestartGroup.changed(snapshotStateMap) | composerStartRestartGroup.changedInstance(feedback) | ((i4 & 7168) != 2048);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.cortex.digest.common.feedback.DigestFeedbackSheetComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DigestFeedbackSheetComposable.DigestFeedbackSheetComposable$lambda$6$lambda$5(snapshotStateMap, feedback, feedbackType, onReasonsSubmitted);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    Modifier modifier52 = modifier4;
                    BentoAlerts2.AlertContent(modifier52, null, strStringResource3, null, CollectionsKt.listOf(new BentoAlertButton(strStringResource22, (Function0) objRememberedValue2, modifierAutoLogEvents$default2, null, null, z, 24, null)), false, ComposableLambda3.rememberComposableLambda(499818771, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.common.feedback.DigestFeedbackSheetComposableKt.DigestFeedbackSheetComposable.2

                        /* compiled from: DigestFeedbackSheetComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.cortex.digest.common.feedback.DigestFeedbackSheetComposableKt$DigestFeedbackSheetComposable$2$1, reason: invalid class name */
                        static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                            final /* synthetic */ DigestFeedback $feedback;
                            final /* synthetic */ DigestFeedbackType $feedbackType;
                            final /* synthetic */ boolean $loading;
                            final /* synthetic */ SnapshotStateMap<String, Boolean> $selectedReasons;

                            /* compiled from: DigestFeedbackSheetComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            /* renamed from: com.robinhood.android.cortex.digest.common.feedback.DigestFeedbackSheetComposableKt$DigestFeedbackSheetComposable$2$1$WhenMappings */
                            public /* synthetic */ class WhenMappings {
                                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                static {
                                    int[] iArr = new int[DigestFeedbackType.values().length];
                                    try {
                                        iArr[DigestFeedbackType.LIKE.ordinal()] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    try {
                                        iArr[DigestFeedbackType.DISLIKE.ordinal()] = 2;
                                    } catch (NoSuchFieldError unused2) {
                                    }
                                    $EnumSwitchMapping$0 = iArr;
                                }
                            }

                            AnonymousClass1(DigestFeedbackType digestFeedbackType, DigestFeedback digestFeedback, SnapshotStateMap<String, Boolean> snapshotStateMap, boolean z) {
                                this.$feedbackType = digestFeedbackType;
                                this.$feedback = digestFeedback;
                                this.$selectedReasons = snapshotStateMap;
                                this.$loading = z;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                invoke(composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$2$lambda$1$lambda$0(SnapshotStateMap snapshotStateMap, DigestFeedback.Reason reason) {
                                snapshotStateMap.put(reason.getDisplayTitle(), Boolean.valueOf(!(((Boolean) snapshotStateMap.get(reason.getDisplayTitle())) != null ? r1.booleanValue() : reason.getSelected())));
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer, int i) {
                                List<DigestFeedback.Reason> likeReasons;
                                Composer composer2 = composer;
                                if ((i & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(930303134, i, -1, "com.robinhood.android.cortex.digest.common.feedback.DigestFeedbackSheetComposable.<anonymous>.<anonymous> (DigestFeedbackSheetComposable.kt:78)");
                                }
                                int i2 = WhenMappings.$EnumSwitchMapping$0[this.$feedbackType.ordinal()];
                                if (i2 == 1) {
                                    likeReasons = this.$feedback.getLikeReasons();
                                } else {
                                    if (i2 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    likeReasons = this.$feedback.getDislikeReasons();
                                }
                                final SnapshotStateMap snapshotStateMap = this.$selectedReasons;
                                boolean z = this.$loading;
                                for (final DigestFeedback.Reason reason : likeReasons) {
                                    BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.Checkbox;
                                    String displayTitle = reason.getDisplayTitle();
                                    Boolean bool = snapshotStateMap.get(reason.getDisplayTitle());
                                    BentoSelectionRowState bentoSelectionRowState = new BentoSelectionRowState(type2, displayTitle, bool != null ? bool.booleanValue() : reason.getSelected(), (BentoBaseRowState.Text) null, !z, false, (BentoSelectionRowState.IconPosition) null, true, false, (ImmutableMap) null, (Function0) null, 1896, (DefaultConstructorMarker) null);
                                    composer2.startReplaceGroup(-1633490746);
                                    boolean zChanged = composer2.changed(snapshotStateMap) | composer2.changedInstance(reason);
                                    Object objRememberedValue = composer2.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.android.cortex.digest.common.feedback.DigestFeedbackSheetComposableKt$DigestFeedbackSheetComposable$2$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return DigestFeedbackSheetComposable.C120752.AnonymousClass1.invoke$lambda$2$lambda$1$lambda$0(snapshotStateMap, reason);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue);
                                    }
                                    composer2.endReplaceGroup();
                                    BentoSelectionRow2.BentoSelectionRow(null, bentoSelectionRowState, (Function0) objRememberedValue, composer2, BentoSelectionRowState.$stable << 3, 1);
                                    composer2 = composer;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i8) {
                            if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(499818771, i8, -1, "com.robinhood.android.cortex.digest.common.feedback.DigestFeedbackSheetComposable.<anonymous> (DigestFeedbackSheetComposable.kt:77)");
                            }
                            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(930303134, true, new AnonymousClass1(feedbackType, feedback, snapshotStateMap, z), composer3, 54), composer3, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composer2, ((i4 >> 12) & 14) | 1572864 | (BentoAlertButton.$stable << 12), 42);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DigestFeedbackSheetComposable$lambda$6$lambda$5(SnapshotStateMap snapshotStateMap, DigestFeedback digestFeedback, DigestFeedbackType digestFeedbackType, Function1 function1) {
        DigestFeedback.Reaction reaction;
        DigestFeedback.Reason reasonCopy$default;
        DigestFeedback.Reason reasonCopy$default2;
        Map map = snapshotStateMap.toMap();
        int i = WhenMappings.$EnumSwitchMapping$0[digestFeedbackType.ordinal()];
        if (i == 1) {
            reaction = DigestFeedback.Reaction.LIKE;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            reaction = DigestFeedback.Reaction.DISLIKE;
        }
        List<DigestFeedback.Reason> likeReasons = digestFeedback.getLikeReasons();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(likeReasons, 10));
        for (DigestFeedback.Reason reason : likeReasons) {
            Boolean bool = (Boolean) map.get(reason.getDisplayTitle());
            if (bool != null && (reasonCopy$default2 = DigestFeedback.Reason.copy$default(reason, null, bool.booleanValue(), 1, null)) != null) {
                reason = reasonCopy$default2;
            }
            arrayList.add(reason);
        }
        List<DigestFeedback.Reason> dislikeReasons = digestFeedback.getDislikeReasons();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(dislikeReasons, 10));
        for (DigestFeedback.Reason reason2 : dislikeReasons) {
            Boolean bool2 = (Boolean) map.get(reason2.getDisplayTitle());
            if (bool2 != null && (reasonCopy$default = DigestFeedback.Reason.copy$default(reason2, null, bool2.booleanValue(), 1, null)) != null) {
                reason2 = reasonCopy$default;
            }
            arrayList2.add(reason2);
        }
        function1.invoke(digestFeedback.copyWith(reaction, arrayList, arrayList2));
        return Unit.INSTANCE;
    }
}
