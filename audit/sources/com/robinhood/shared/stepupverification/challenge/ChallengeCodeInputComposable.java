package com.robinhood.shared.stepupverification.challenge;

import android.view.KeyEvent;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPadding6;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.component.numpad.BentoNumpad4;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScreenLayout;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.lib.challenge.C39076R;
import com.robinhood.shared.stepupverification.C39791R;
import com.robinhood.shared.stepupverification.challenge.ChallengeCodeInputComposable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ChallengeCodeInputComposable.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0085\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u000b\u001a\u0012\u0012\b\u0012\u00060\rj\u0002`\u000e\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0001¢\u0006\u0002\u0010\u0014\u001a/\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0003¢\u0006\u0002\u0010\u0016\u001aQ\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u00052\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010H\u0003¢\u0006\u0002\u0010\u0019¨\u0006\u001a²\u0006\n\u0010\u001b\u001a\u00020\u0003X\u008a\u008e\u0002"}, m3636d2 = {"ChallengeCodeInputComposable", "", "isLoading", "", "title", "", "subtitle", "inputText", "bottomSheetTitle", "bottomSheetSubtitle", "fallbackText", "onKeyPress", "Lkotlin/Function1;", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "onResendCodeClicked", "Lkotlin/Function0;", "onFallbackClicked", "modifier", "Landroidx/compose/ui/Modifier;", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "MainContent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "HelpBottomSheet", "onDismissRequest", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-step-up-verification_externalDebug", "showHelpBottomSheet"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.stepupverification.challenge.ChallengeCodeInputComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class ChallengeCodeInputComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChallengeCodeInputComposable$lambda$5(boolean z, String str, String str2, String str3, String str4, String str5, String str6, Function1 function1, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        ChallengeCodeInputComposable(z, str, str2, str3, str4, str5, str6, function1, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HelpBottomSheet$lambda$10(String str, String str2, String str3, Function0 function0, Function0 function02, Function0 function03, int i, Composer composer, int i2) {
        HelpBottomSheet(str, str2, str3, function0, function02, function03, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainContent$lambda$9(String str, String str2, String str3, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MainContent(str, str2, str3, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChallengeCodeInputComposable(final boolean z, final String title, final String subtitle, final String inputText, final String bottomSheetTitle, final String bottomSheetSubtitle, final String str, final Function1<? super KeyEvent, Unit> onKeyPress, final Function0<Unit> onResendCodeClicked, final Function0<Unit> onFallbackClicked, Modifier modifier, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        String str2;
        int i5;
        Modifier modifier2;
        int i6;
        Object objRememberedValue;
        Composer.Companion companion;
        Composer.Companion companion2;
        final SnapshotState snapshotState;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(inputText, "inputText");
        Intrinsics.checkNotNullParameter(bottomSheetTitle, "bottomSheetTitle");
        Intrinsics.checkNotNullParameter(bottomSheetSubtitle, "bottomSheetSubtitle");
        Intrinsics.checkNotNullParameter(onKeyPress, "onKeyPress");
        Intrinsics.checkNotNullParameter(onResendCodeClicked, "onResendCodeClicked");
        Intrinsics.checkNotNullParameter(onFallbackClicked, "onFallbackClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(354054447);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(title) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(subtitle) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(inputText) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(bottomSheetTitle) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((i & 196608) == 0) {
            i4 |= composerStartRestartGroup.changed(bottomSheetSubtitle) ? 131072 : 65536;
        }
        if ((i3 & 64) == 0) {
            if ((i & 1572864) == 0) {
                str2 = str;
                i4 |= composerStartRestartGroup.changed(str2) ? 1048576 : 524288;
            }
            if ((i3 & 128) == 0) {
                i4 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(onKeyPress) ? 8388608 : 4194304;
            }
            if ((i3 & 256) == 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(onResendCodeClicked) ? 67108864 : 33554432;
            }
            if ((i3 & 512) == 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(onFallbackClicked) ? 536870912 : 268435456;
            }
            i5 = i3 & 1024;
            if (i5 == 0) {
                modifier2 = modifier;
                i6 = i2 | 6;
            } else {
                modifier2 = modifier;
                if ((i2 & 6) == 0) {
                    i6 = i2 | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
                } else {
                    i6 = i2;
                }
            }
            if ((i4 & 306783379) != 306783378 && (i6 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
            } else {
                if (i5 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(354054447, i4, i6, "com.robinhood.shared.stepupverification.challenge.ChallengeCodeInputComposable (ChallengeCodeInputComposable.kt:51)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                int i7 = i6;
                if (objRememberedValue != companion.getEmpty()) {
                    companion2 = companion;
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    companion2 = companion;
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                BentoNumpadScreenLayout.BentoNumpadScreenLayout(modifier2, ComposableLambda3.rememberComposableLambda(-1004744468, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.stepupverification.challenge.ChallengeCodeInputComposableKt.ChallengeCodeInputComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i8) {
                        if ((i8 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1004744468, i8, -1, "com.robinhood.shared.stepupverification.challenge.ChallengeCodeInputComposable.<anonymous> (ChallengeCodeInputComposable.kt:57)");
                        }
                        ChallengeCodeInputComposable.MainContent(title, subtitle, inputText, null, composer2, 0, 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-608873476, true, new C397962(z, onKeyPress, snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, (i7 & 14) | 432, 0);
                if (ChallengeCodeInputComposable$lambda$1(snapshotState)) {
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion2.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.stepupverification.challenge.ChallengeCodeInputComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ChallengeCodeInputComposable.ChallengeCodeInputComposable$lambda$4$lambda$3(snapshotState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    int i8 = i4 >> 12;
                    HelpBottomSheet(bottomSheetTitle, bottomSheetSubtitle, str2, (Function0) objRememberedValue2, onResendCodeClicked, onFallbackClicked, composerStartRestartGroup, (i8 & 458752) | (i8 & 14) | 3072 | (i8 & 112) | (i8 & 896) | (57344 & i8));
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier3 = modifier2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.stepupverification.challenge.ChallengeCodeInputComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ChallengeCodeInputComposable.ChallengeCodeInputComposable$lambda$5(z, title, subtitle, inputText, bottomSheetTitle, bottomSheetSubtitle, str, onKeyPress, onResendCodeClicked, onFallbackClicked, modifier3, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 1572864;
        str2 = str;
        if ((i3 & 128) == 0) {
        }
        if ((i3 & 256) == 0) {
        }
        if ((i3 & 512) == 0) {
        }
        i5 = i3 & 1024;
        if (i5 == 0) {
        }
        if ((i4 & 306783379) != 306783378) {
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            int i72 = i6;
            if (objRememberedValue != companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            BentoNumpadScreenLayout.BentoNumpadScreenLayout(modifier2, ComposableLambda3.rememberComposableLambda(-1004744468, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.stepupverification.challenge.ChallengeCodeInputComposableKt.ChallengeCodeInputComposable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i82) {
                    if ((i82 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1004744468, i82, -1, "com.robinhood.shared.stepupverification.challenge.ChallengeCodeInputComposable.<anonymous> (ChallengeCodeInputComposable.kt:57)");
                    }
                    ChallengeCodeInputComposable.MainContent(title, subtitle, inputText, null, composer2, 0, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-608873476, true, new C397962(z, onKeyPress, snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, (i72 & 14) | 432, 0);
            if (ChallengeCodeInputComposable$lambda$1(snapshotState)) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChallengeCodeInputComposable$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: ChallengeCodeInputComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.stepupverification.challenge.ChallengeCodeInputComposableKt$ChallengeCodeInputComposable$2 */
    static final class C397962 implements Function3<BentoNumpad4, Composer, Integer, Unit> {
        final /* synthetic */ boolean $isLoading;
        final /* synthetic */ Function1<KeyEvent, Unit> $onKeyPress;
        final /* synthetic */ SnapshotState<Boolean> $showHelpBottomSheet$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C397962(boolean z, Function1<? super KeyEvent, Unit> function1, SnapshotState<Boolean> snapshotState) {
            this.$isLoading = z;
            this.$onKeyPress = function1;
            this.$showHelpBottomSheet$delegate = snapshotState;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BentoNumpad4 bentoNumpad4, Composer composer, Integer num) {
            invoke(bentoNumpad4, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(SnapshotState snapshotState) {
            ChallengeCodeInputComposable.ChallengeCodeInputComposable$lambda$2(snapshotState, true);
            return Unit.INSTANCE;
        }

        public final void invoke(BentoNumpad4 BentoNumpadScreenLayout, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(BentoNumpadScreenLayout, "$this$BentoNumpadScreenLayout");
            if ((i & 6) == 0) {
                i2 = i | ((i & 8) == 0 ? composer.changed(BentoNumpadScreenLayout) : composer.changedInstance(BentoNumpadScreenLayout) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-608873476, i2, -1, "com.robinhood.shared.stepupverification.challenge.ChallengeCodeInputComposable.<anonymous> (ChallengeCodeInputComposable.kt:64)");
            }
            boolean z = this.$isLoading;
            Function1<KeyEvent, Unit> function1 = this.$onKeyPress;
            final SnapshotState<Boolean> snapshotState = this.$showHelpBottomSheet$delegate;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.NEED_HELP, null, null, null, 59, null), false, false, false, true, false, null, 110, null);
            BentoButtons.Type type2 = BentoButtons.Type.Secondary;
            String strStringResource = StringResources_androidKt.stringResource(C39076R.string.challenge_verification_response_need_help, composer, 0);
            composer.startReplaceGroup(5004770);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.stepupverification.challenge.ChallengeCodeInputComposableKt$ChallengeCodeInputComposable$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ChallengeCodeInputComposable.C397962.invoke$lambda$2$lambda$1$lambda$0(snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierAutoLogEvents$default, null, type2, false, z, null, null, null, null, false, null, composer, 24582, 0, 8104);
            BentoNumpadScreenLayout.BentoNumpadOnly(WindowInsetsPadding6.windowInsetsPadding(companion, WindowInsets_androidKt.getNavigationBars(WindowInsets.INSTANCE, composer, 6)), function1, !z, false, false, null, composer, (BentoNumpad4.$stable << 18) | 3072 | (3670016 & (i2 << 18)), 48);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    private static final boolean ChallengeCodeInputComposable$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* compiled from: ChallengeCodeInputComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.stepupverification.challenge.ChallengeCodeInputComposableKt$HelpBottomSheet$1 */
    static final class C397971 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
        final /* synthetic */ String $fallbackText;
        final /* synthetic */ Function0<Unit> $onFallbackClicked;
        final /* synthetic */ Function0<Unit> $onResendCodeClicked;
        final /* synthetic */ String $subtitle;
        final /* synthetic */ String $title;

        C397971(String str, String str2, Function0<Unit> function0, String str3, Function0<Unit> function02) {
            this.$title = str;
            this.$subtitle = str2;
            this.$onResendCodeClicked = function0;
            this.$fallbackText = str3;
            this.$onFallbackClicked = function02;
        }

        /* JADX WARN: Removed duplicated region for block: B:48:0x01e0  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x01e8  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0229  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x022e  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0288  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0290  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x031e  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x032f  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0339  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0341  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x036d  */
        /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
            int i2;
            final RhModalBottomSheet5 rhModalBottomSheet5;
            boolean z;
            boolean z2;
            Object objRememberedValue;
            final RhModalBottomSheet5 rhModalBottomSheet52;
            boolean z3;
            boolean z4;
            Object objRememberedValue2;
            Composer composer2;
            Modifier.Companion companion;
            Object obj;
            boolean z5;
            Object objRememberedValue3;
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
                ComposerKt.traceEventStart(-1223984315, i2, -1, "com.robinhood.shared.stepupverification.challenge.HelpBottomSheet.<anonymous> (ChallengeCodeInputComposable.kt:157)");
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion2, 0.0f, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 1, null);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            int i4 = i2;
            String str = this.$title;
            String str2 = this.$subtitle;
            final Function0<Unit> function0 = this.$onResendCodeClicked;
            String str3 = this.$fallbackText;
            final Function0<Unit> function02 = this.$onFallbackClicked;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion2, 0.0f, bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM(), 1, null);
            TextAlign.Companion companion4 = TextAlign.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(str, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getDisplayCapsuleMedium(), composer, 0, 0, 8124);
            BentoText2.m20747BentoText38GnDrw(str2, PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion2, 0.0f, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 1, null), null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getTextM(), composer, 0, 0, 8124);
            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            UserInteractionEventData.Action action = UserInteractionEventData.Action.RESEND_CHALLENGE;
            Component.ComponentType componentType = Component.ComponentType.BOTTOM_SHEET;
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(companion2, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, action, null, new Component(componentType, null, null, 6, null), null, 43, null), false, false, false, true, false, null, 110, null);
            String strStringResource = StringResources_androidKt.stringResource(C39076R.string.challenge_verification_help_resend_code, composer, 0);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(function0);
            int i5 = i4 & 14;
            if (i5 != 4) {
                if ((i4 & 8) != 0) {
                    rhModalBottomSheet5 = RhModalBottomSheet;
                    if (composer.changedInstance(rhModalBottomSheet5)) {
                    }
                    z2 = zChanged | z;
                    objRememberedValue = composer.rememberedValue();
                    if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.shared.stepupverification.challenge.ChallengeCodeInputComposableKt$HelpBottomSheet$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ChallengeCodeInputComposable.C397971.invoke$lambda$6$lambda$1$lambda$0(function0, rhModalBottomSheet5);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierAutoLogEvents$default, null, strStringResource, null, null, null, null, false, false, false, 0L, (Function0) objRememberedValue, composer, 0, 0, 2042);
                    composer.startReplaceGroup(1631712768);
                    if (str3 == null) {
                        composer2 = composer;
                        companion = companion2;
                    } else {
                        Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(companion2, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.CHALLENGE_FALLBACK, null, new Component(componentType, null, null, 6, null), null, 43, null), false, false, false, true, false, null, 110, null);
                        composer.startReplaceGroup(-1633490746);
                        boolean zChanged2 = composer.changed(function02);
                        if (i5 != 4) {
                            if ((i4 & 8) != 0) {
                                rhModalBottomSheet52 = RhModalBottomSheet;
                                if (composer.changedInstance(rhModalBottomSheet52)) {
                                }
                                z4 = zChanged2 | z3;
                                objRememberedValue2 = composer.rememberedValue();
                                if (z4 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.stepupverification.challenge.ChallengeCodeInputComposableKt$HelpBottomSheet$1$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return ChallengeCodeInputComposable.C397971.invoke$lambda$6$lambda$4$lambda$3$lambda$2(function02, rhModalBottomSheet52);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                composer.endReplaceGroup();
                                composer2 = composer;
                                companion = companion2;
                                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierAutoLogEvents$default2, null, str3, null, null, null, null, false, false, false, 0L, (Function0) objRememberedValue2, composer2, 0, 0, 2042);
                                Unit unit = Unit.INSTANCE;
                            } else {
                                rhModalBottomSheet52 = RhModalBottomSheet;
                            }
                            z3 = false;
                            z4 = zChanged2 | z3;
                            objRememberedValue2 = composer.rememberedValue();
                            if (z4) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.stepupverification.challenge.ChallengeCodeInputComposableKt$HelpBottomSheet$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return ChallengeCodeInputComposable.C397971.invoke$lambda$6$lambda$4$lambda$3$lambda$2(function02, rhModalBottomSheet52);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                                composer.endReplaceGroup();
                                composer2 = composer;
                                companion = companion2;
                                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierAutoLogEvents$default2, null, str3, null, null, null, null, false, false, false, 0L, (Function0) objRememberedValue2, composer2, 0, 0, 2042);
                                Unit unit2 = Unit.INSTANCE;
                            }
                        } else {
                            rhModalBottomSheet52 = RhModalBottomSheet;
                        }
                        z3 = true;
                        z4 = zChanged2 | z3;
                        objRememberedValue2 = composer.rememberedValue();
                        if (z4) {
                        }
                    }
                    composer2.endReplaceGroup();
                    Modifier modifierAutoLogEvents$default3 = ModifiersKt.autoLogEvents$default(PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer2, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.CANCEL, null, new Component(componentType, null, null, 6, null), null, 43, null), false, false, false, true, false, null, 110, null);
                    BentoButtons.Type type2 = BentoButtons.Type.Secondary;
                    String strStringResource2 = StringResources_androidKt.stringResource(C39791R.string.challenge_bottom_sheet_dismiss, composer2, 0);
                    composer2.startReplaceGroup(5004770);
                    if (i5 != 4) {
                        if ((i4 & 8) != 0) {
                            obj = RhModalBottomSheet;
                            if (composer2.changedInstance(obj)) {
                            }
                            objRememberedValue3 = composer2.rememberedValue();
                            if (z5 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new ChallengeCodeInputComposable2(obj);
                                composer2.updateRememberedValue(objRememberedValue3);
                            }
                            composer2.endReplaceGroup();
                            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue3, strStringResource2, modifierAutoLogEvents$default3, null, type2, false, false, null, null, null, null, false, null, composer, 24576, 0, 8168);
                            composer.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        obj = RhModalBottomSheet;
                        z5 = false;
                        objRememberedValue3 = composer2.rememberedValue();
                        if (z5) {
                            objRememberedValue3 = new ChallengeCodeInputComposable2(obj);
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        composer2.endReplaceGroup();
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue3, strStringResource2, modifierAutoLogEvents$default3, null, type2, false, false, null, null, null, null, false, null, composer, 24576, 0, 8168);
                        composer.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    } else {
                        obj = RhModalBottomSheet;
                    }
                    z5 = true;
                    objRememberedValue3 = composer2.rememberedValue();
                    if (z5) {
                    }
                    composer2.endReplaceGroup();
                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue3, strStringResource2, modifierAutoLogEvents$default3, null, type2, false, false, null, null, null, null, false, null, composer, 24576, 0, 8168);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                } else {
                    rhModalBottomSheet5 = RhModalBottomSheet;
                }
                z = false;
                z2 = zChanged | z;
                objRememberedValue = composer.rememberedValue();
                if (z2) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.stepupverification.challenge.ChallengeCodeInputComposableKt$HelpBottomSheet$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ChallengeCodeInputComposable.C397971.invoke$lambda$6$lambda$1$lambda$0(function0, rhModalBottomSheet5);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierAutoLogEvents$default, null, strStringResource, null, null, null, null, false, false, false, 0L, (Function0) objRememberedValue, composer, 0, 0, 2042);
                composer.startReplaceGroup(1631712768);
                if (str3 == null) {
                }
                composer2.endReplaceGroup();
                Modifier modifierAutoLogEvents$default32 = ModifiersKt.autoLogEvents$default(PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer2, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.CANCEL, null, new Component(componentType, null, null, 6, null), null, 43, null), false, false, false, true, false, null, 110, null);
                BentoButtons.Type type22 = BentoButtons.Type.Secondary;
                String strStringResource22 = StringResources_androidKt.stringResource(C39791R.string.challenge_bottom_sheet_dismiss, composer2, 0);
                composer2.startReplaceGroup(5004770);
                if (i5 != 4) {
                }
                z5 = true;
                objRememberedValue3 = composer2.rememberedValue();
                if (z5) {
                }
                composer2.endReplaceGroup();
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue3, strStringResource22, modifierAutoLogEvents$default32, null, type22, false, false, null, null, null, null, false, null, composer, 24576, 0, 8168);
                composer.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
            } else {
                rhModalBottomSheet5 = RhModalBottomSheet;
            }
            z = true;
            z2 = zChanged | z;
            objRememberedValue = composer.rememberedValue();
            if (z2) {
            }
            composer.endReplaceGroup();
            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierAutoLogEvents$default, null, strStringResource, null, null, null, null, false, false, false, 0L, (Function0) objRememberedValue, composer, 0, 0, 2042);
            composer.startReplaceGroup(1631712768);
            if (str3 == null) {
            }
            composer2.endReplaceGroup();
            Modifier modifierAutoLogEvents$default322 = ModifiersKt.autoLogEvents$default(PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer2, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.CANCEL, null, new Component(componentType, null, null, 6, null), null, 43, null), false, false, false, true, false, null, 110, null);
            BentoButtons.Type type222 = BentoButtons.Type.Secondary;
            String strStringResource222 = StringResources_androidKt.stringResource(C39791R.string.challenge_bottom_sheet_dismiss, composer2, 0);
            composer2.startReplaceGroup(5004770);
            if (i5 != 4) {
            }
            z5 = true;
            objRememberedValue3 = composer2.rememberedValue();
            if (z5) {
            }
            composer2.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue3, strStringResource222, modifierAutoLogEvents$default322, null, type222, false, false, null, null, null, null, false, null, composer, 24576, 0, 8168);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
            invoke(rhModalBottomSheet5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$1$lambda$0(Function0 function0, RhModalBottomSheet5 rhModalBottomSheet5) {
            function0.invoke();
            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$4$lambda$3$lambda$2(Function0 function0, RhModalBottomSheet5 rhModalBottomSheet5) {
            function0.invoke();
            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChallengeCodeInputComposable$lambda$4$lambda$3(SnapshotState snapshotState) {
        ChallengeCodeInputComposable$lambda$2(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MainContent(final String str, final String str2, final String str3, Modifier modifier, Composer composer, final int i, final int i2) {
        String str4;
        int i3;
        String str5;
        String str6;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(2005423074);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str4 = str;
        } else {
            str4 = str;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(str4) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                str5 = str2;
                i3 |= composerStartRestartGroup.changed(str5) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    str6 = str3;
                    i3 |= composerStartRestartGroup.changed(str6) ? 256 : 128;
                }
                i4 = i2 & 8;
                if (i4 == 0) {
                    if ((i & 3072) == 0) {
                        modifier2 = modifier;
                        i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                    }
                    if ((i3 & 1171) != 1170 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier2;
                    } else {
                        Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2005423074, i3, -1, "com.robinhood.shared.stepupverification.challenge.MainContent (ChallengeCodeInputComposable.kt:106)");
                        }
                        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i5 = BentoTheme.$stable;
                        Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                        TextAlign.Companion companion3 = TextAlign.INSTANCE;
                        Modifier modifier5 = modifier4;
                        BentoText2.m20747BentoText38GnDrw(str4, modifierM5146paddingqDBjuR0$default, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium(), composerStartRestartGroup, i3 & 14, 0, 8124);
                        String str7 = str5;
                        BentoText2.m20747BentoText38GnDrw(str7, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM(), composerStartRestartGroup, (i3 >> 3) & 14, 0, 8124);
                        Spacer2.Spacer(Column5.weight$default(column6, companion2, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.shared.stepupverification.challenge.ChallengeCodeInputComposableKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ChallengeCodeInputComposable.MainContent$lambda$8$lambda$7$lambda$6((String) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        BentoTextInput4.BentoHeroTextInput(str6, (Function1) objRememberedValue, null, null, StringResources_androidKt.stringResource(C39076R.string.challenge_verification_input_placeholder, composerStartRestartGroup, 0), null, null, null, null, null, null, null, false, true, composerStartRestartGroup, ((i3 >> 6) & 14) | 48, 3072, 8172);
                        composer2 = composerStartRestartGroup;
                        Spacer2.Spacer(Column5.weight$default(column6, companion2, 1.0f, false, 2, null), composer2, 0);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.stepupverification.challenge.ChallengeCodeInputComposableKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ChallengeCodeInputComposable.MainContent$lambda$9(str, str2, str3, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 3072;
                modifier2 = modifier;
                if ((i3 & 1171) != 1170) {
                    if (i4 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), 0.0f, 1, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default2);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion4.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        Modifier.Companion companion22 = Modifier.INSTANCE;
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i52 = BentoTheme.$stable;
                        Modifier modifierM5146paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion22, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                        TextAlign.Companion companion32 = TextAlign.INSTANCE;
                        Modifier modifier52 = modifier4;
                        BentoText2.m20747BentoText38GnDrw(str4, modifierM5146paddingqDBjuR0$default2, null, null, null, null, TextAlign.m7912boximpl(companion32.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleMedium(), composerStartRestartGroup, i3 & 14, 0, 8124);
                        String str72 = str5;
                        BentoText2.m20747BentoText38GnDrw(str72, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion22, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, TextAlign.m7912boximpl(companion32.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextM(), composerStartRestartGroup, (i3 >> 3) & 14, 0, 8124);
                        Spacer2.Spacer(Column5.weight$default(column62, companion22, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        BentoTextInput4.BentoHeroTextInput(str6, (Function1) objRememberedValue, null, null, StringResources_androidKt.stringResource(C39076R.string.challenge_verification_input_placeholder, composerStartRestartGroup, 0), null, null, null, null, null, null, null, false, true, composerStartRestartGroup, ((i3 >> 6) & 14) | 48, 3072, 8172);
                        composer2 = composerStartRestartGroup;
                        Spacer2.Spacer(Column5.weight$default(column62, companion22, 1.0f, false, 2, null), composer2, 0);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            str6 = str3;
            i4 = i2 & 8;
            if (i4 == 0) {
            }
            modifier2 = modifier;
            if ((i3 & 1171) != 1170) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        str5 = str2;
        if ((i2 & 4) == 0) {
        }
        str6 = str3;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        if ((i3 & 1171) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainContent$lambda$8$lambda$7$lambda$6(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    private static final void HelpBottomSheet(final String str, final String str2, final String str3, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(539189822);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function03) ? 131072 : 65536;
        }
        if ((74899 & i2) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(539189822, i2, -1, "com.robinhood.shared.stepupverification.challenge.HelpBottomSheet (ChallengeCodeInputComposable.kt:147)");
            }
            composer2 = composerStartRestartGroup;
            RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(function0, ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BOTTOM_SHEET, null, null, 6, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), false, null, null, 0L, ComposableLambda3.rememberComposableLambda(-1223984315, true, new C397971(str, str2, function02, str3, function03), composerStartRestartGroup, 54), composer2, ((i2 >> 9) & 14) | 1572864, 60);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.stepupverification.challenge.ChallengeCodeInputComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChallengeCodeInputComposable.HelpBottomSheet$lambda$10(str, str2, str3, function0, function02, function03, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
