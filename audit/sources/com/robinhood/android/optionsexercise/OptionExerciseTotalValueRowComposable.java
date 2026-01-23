package com.robinhood.android.optionsexercise;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.TextUnit;
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionTextView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.optionsexercise.OptionExerciseTotalValueRowComposable;
import com.robinhood.android.optionsexercise.logging.OptionExerciseLogging;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.utils.p409ui.color.ThemeColors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionExerciseTotalValueRowComposable.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aU\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"OptionExerciseTotalValueRowComposable", "", "totalLabelString", "", "shortPositionText", "borrowFeeString", "Lcom/robinhood/android/optionsexercise/OptionExerciseBorrowFeeState;", "totalPriceString", "showSubtitleIcon", "", "modifier", "Landroidx/compose/ui/Modifier;", "onShortInfoIconTapped", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/optionsexercise/OptionExerciseBorrowFeeState;Ljava/lang/String;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "feature-options-exercise_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsexercise.OptionExerciseTotalValueRowComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionExerciseTotalValueRowComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionExerciseTotalValueRowComposable$lambda$0(String str, String str2, OptionExerciseBorrowFeeState optionExerciseBorrowFeeState, String str3, boolean z, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        OptionExerciseTotalValueRowComposable(str, str2, optionExerciseBorrowFeeState, str3, z, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OptionExerciseTotalValueRowComposable(final String str, final String str2, final OptionExerciseBorrowFeeState optionExerciseBorrowFeeState, final String str3, final boolean z, Modifier modifier, final Function0<Unit> onShortInfoIconTapped, Composer composer, final int i, final int i2) {
        String str4;
        int i3;
        String str5;
        OptionExerciseBorrowFeeState optionExerciseBorrowFeeState2;
        String str6;
        boolean z2;
        int i4;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onShortInfoIconTapped, "onShortInfoIconTapped");
        Composer composerStartRestartGroup = composer.startRestartGroup(1716708287);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str4 = str;
        } else if ((i & 6) == 0) {
            str4 = str;
            i3 = (composerStartRestartGroup.changed(str4) ? 4 : 2) | i;
        } else {
            str4 = str;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            str5 = str2;
        } else {
            str5 = str2;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(str5) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                optionExerciseBorrowFeeState2 = optionExerciseBorrowFeeState;
                i3 |= composerStartRestartGroup.changed(optionExerciseBorrowFeeState2) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    str6 = str3;
                    i3 |= composerStartRestartGroup.changed(str6) ? 2048 : 1024;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        z2 = z;
                        i3 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                    }
                    i4 = i2 & 32;
                    if (i4 != 0) {
                        if ((196608 & i) == 0) {
                            modifier2 = modifier;
                            i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
                        }
                        if ((i2 & 64) != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(onShortInfoIconTapped) ? 1048576 : 524288;
                        }
                        if ((599187 & i3) != 599186 || !composerStartRestartGroup.getSkipping()) {
                            Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1716708287, i3, -1, "com.robinhood.android.optionsexercise.OptionExerciseTotalValueRowComposable (OptionExerciseTotalValueRowComposable.kt:42)");
                            }
                            String str7 = str6;
                            OptionExerciseBorrowFeeState optionExerciseBorrowFeeState3 = optionExerciseBorrowFeeState2;
                            String str8 = str4;
                            Modifier modifier5 = modifier4;
                            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, OptionExerciseLogging.getOPTION_EXERCISE_SCREEN(), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-1816797526, true, new C247031(modifier5, str7, str8, str5, optionExerciseBorrowFeeState3, z2, onShortInfoIconTapped), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier5;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsexercise.OptionExerciseTotalValueRowComposableKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return OptionExerciseTotalValueRowComposable.OptionExerciseTotalValueRowComposable$lambda$0(str, str2, optionExerciseBorrowFeeState, str3, z, modifier3, onShortInfoIconTapped, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 196608;
                    modifier2 = modifier;
                    if ((i2 & 64) != 0) {
                    }
                    if ((599187 & i3) != 599186) {
                        if (i4 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        String str72 = str6;
                        OptionExerciseBorrowFeeState optionExerciseBorrowFeeState32 = optionExerciseBorrowFeeState2;
                        String str82 = str4;
                        Modifier modifier52 = modifier4;
                        AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, OptionExerciseLogging.getOPTION_EXERCISE_SCREEN(), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-1816797526, true, new C247031(modifier52, str72, str82, str5, optionExerciseBorrowFeeState32, z2, onShortInfoIconTapped), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                z2 = z;
                i4 = i2 & 32;
                if (i4 != 0) {
                }
                modifier2 = modifier;
                if ((i2 & 64) != 0) {
                }
                if ((599187 & i3) != 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            str6 = str3;
            if ((i2 & 16) != 0) {
            }
            z2 = z;
            i4 = i2 & 32;
            if (i4 != 0) {
            }
            modifier2 = modifier;
            if ((i2 & 64) != 0) {
            }
            if ((599187 & i3) != 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        optionExerciseBorrowFeeState2 = optionExerciseBorrowFeeState;
        if ((i2 & 8) == 0) {
        }
        str6 = str3;
        if ((i2 & 16) != 0) {
        }
        z2 = z;
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i2 & 64) != 0) {
        }
        if ((599187 & i3) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: OptionExerciseTotalValueRowComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.optionsexercise.OptionExerciseTotalValueRowComposableKt$OptionExerciseTotalValueRowComposable$1 */
    static final class C247031 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ OptionExerciseBorrowFeeState $borrowFeeString;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onShortInfoIconTapped;
        final /* synthetic */ String $shortPositionText;
        final /* synthetic */ boolean $showSubtitleIcon;
        final /* synthetic */ String $totalLabelString;
        final /* synthetic */ String $totalPriceString;

        C247031(Modifier modifier, String str, String str2, String str3, OptionExerciseBorrowFeeState optionExerciseBorrowFeeState, boolean z, Function0<Unit> function0) {
            this.$modifier = modifier;
            this.$totalPriceString = str;
            this.$totalLabelString = str2;
            this.$shortPositionText = str3;
            this.$borrowFeeString = optionExerciseBorrowFeeState;
            this.$showSubtitleIcon = z;
            this.$onShortInfoIconTapped = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            boolean z;
            Function0<Unit> function0;
            Modifier.Companion companion;
            String str;
            BoxScopeInstance boxScopeInstance;
            int i2;
            OptionExerciseBorrowFeeState optionExerciseBorrowFeeState;
            String str2;
            BentoTheme bentoTheme;
            int i3;
            BentoTheme bentoTheme2;
            int i4;
            Modifier.Companion companion2;
            Composer composer2 = composer;
            if ((i & 3) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1816797526, i, -1, "com.robinhood.android.optionsexercise.OptionExerciseTotalValueRowComposable.<anonymous> (OptionExerciseTotalValueRowComposable.kt:46)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(this.$modifier, 0.0f, 1, null);
            BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, 0.0f, bentoTheme3.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM(), 1, null);
            String str3 = this.$totalPriceString;
            String str4 = this.$totalLabelString;
            String str5 = this.$shortPositionText;
            OptionExerciseBorrowFeeState optionExerciseBorrowFeeState2 = this.$borrowFeeString;
            boolean z2 = this.$showSubtitleIcon;
            Function0<Unit> function02 = this.$onShortInfoIconTapped;
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5144paddingVpY3zN4$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
            if (composer2.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion5 = Modifier.INSTANCE;
            Modifier modifierAlign = boxScopeInstance2.align(companion5, companion3.getCenterStart());
            Alignment.Horizontal start = companion3.getStart();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), start, composer2, 48);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierAlign);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            if (composer2.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composer2.startReplaceGroup(-420998128);
            if (str4 == null) {
                boxScopeInstance = boxScopeInstance2;
                str2 = str3;
                str = str5;
                bentoTheme = bentoTheme3;
                i2 = i5;
                optionExerciseBorrowFeeState = optionExerciseBorrowFeeState2;
                z = z2;
                function0 = function02;
                companion = companion5;
                i3 = 48;
            } else {
                z = z2;
                function0 = function02;
                companion = companion5;
                str = str5;
                boxScopeInstance = boxScopeInstance2;
                i2 = i5;
                optionExerciseBorrowFeeState = optionExerciseBorrowFeeState2;
                str2 = str3;
                bentoTheme = bentoTheme3;
                i3 = 48;
                BentoText2.m20747BentoText38GnDrw(str4, null, Color.m6701boximpl(bentoTheme3.getColors(composer2, i5).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composer2, i5).getTextM(), composer2, 0, 0, 8186);
                Unit unit = Unit.INSTANCE;
            }
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(-420988468);
            if (str == null) {
                bentoTheme2 = bentoTheme;
                i4 = i2;
            } else {
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion3.getCenterVertically(), composer2, i3);
                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier.Companion companion6 = companion;
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, companion6);
                Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                BentoTheme bentoTheme4 = bentoTheme;
                int i6 = i2;
                bentoTheme2 = bentoTheme4;
                int i7 = i2;
                BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(bentoTheme4.getColors(composer2, i6).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme4.getTypography(composer2, i6).getTextS(), composer2, 0, 0, 8186);
                composer2.startReplaceGroup(-47073753);
                if (z) {
                    Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion6, bentoTheme2.getSpacing(composer2, i7).m21595getXsmallD9Ej5fM()), composer2, 0);
                    companion = companion6;
                    i4 = i7;
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.INFO_16), null, bentoTheme2.getColors(composer2, i7).m21426getFg20d7_KjU(), ModifiersKt.autoLogEvents$default(ClickableKt.m4893clickableXHw0xAI$default(companion6, false, null, null, function0, 7, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, "short-position-info", null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null), null, false, composer, BentoIcon4.Size16.$stable | 48, 48);
                    composer2 = composer;
                } else {
                    composer2 = composer2;
                    i4 = i7;
                    companion = companion6;
                }
                composer2.endReplaceGroup();
                composer2.endNode();
                Unit unit2 = Unit.INSTANCE;
            }
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(-420938601);
            final OptionExerciseBorrowFeeState optionExerciseBorrowFeeState3 = optionExerciseBorrowFeeState;
            if (optionExerciseBorrowFeeState3 == null) {
                companion2 = companion;
            } else {
                final float fM8074getValueimpl = TextUnit.m8074getValueimpl(bentoTheme2.getTypography(composer2, i4).getTextS().m7662getFontSizeXSAIIZE());
                composer2.startReplaceGroup(-420935116);
                if (optionExerciseBorrowFeeState3.getAreIndexValid()) {
                    Modifier.Companion companion7 = companion;
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(companion7, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.INLINE_DEFINITION, "short-position-borrowing-fee", null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null);
                    companion2 = companion7;
                    composer2.startReplaceGroup(1849434622);
                    Object objRememberedValue = composer2.rememberedValue();
                    Composer.Companion companion8 = Composer.INSTANCE;
                    if (objRememberedValue == companion8.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseTotalValueRowComposableKt$OptionExerciseTotalValueRowComposable$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return OptionExerciseTotalValueRowComposable.C247031.invoke$lambda$11$lambda$9$lambda$8$lambda$4$lambda$3((Context) obj);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    Function1 function1 = (Function1) objRememberedValue;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(-1633490746);
                    boolean zChanged = composer2.changed(optionExerciseBorrowFeeState3) | composer2.changed(fM8074getValueimpl);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue2 == companion8.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.optionsexercise.OptionExerciseTotalValueRowComposableKt$OptionExerciseTotalValueRowComposable$1$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return OptionExerciseTotalValueRowComposable.C247031.invoke$lambda$11$lambda$9$lambda$8$lambda$7$lambda$6(optionExerciseBorrowFeeState3, fM8074getValueimpl, (RdsInlineDefinitionTextView) obj);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceGroup();
                    AndroidView_androidKt.AndroidView(function1, modifierAutoLogEvents$default, (Function1) objRememberedValue2, composer2, 6, 0);
                } else {
                    companion2 = companion;
                }
                composer2.endReplaceGroup();
                Unit unit3 = Unit.INSTANCE;
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            composer2.startReplaceGroup(506276932);
            if (str2 != null) {
                Modifier modifierAlign2 = boxScopeInstance.align(companion2, companion3.getCenterEnd());
                long jM21425getFg0d7_KjU = bentoTheme2.getColors(composer2, i4).m21425getFg0d7_KjU();
                String str6 = str2;
                BentoText2.m20747BentoText38GnDrw(str6, modifierAlign2, Color.m6701boximpl(jM21425getFg0d7_KjU), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i4).getTextM(), composer2, 24576, 0, 8168);
                Unit unit4 = Unit.INSTANCE;
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final RdsInlineDefinitionTextView invoke$lambda$11$lambda$9$lambda$8$lambda$4$lambda$3(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new RdsInlineDefinitionTextView(context, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$11$lambda$9$lambda$8$lambda$7$lambda$6(OptionExerciseBorrowFeeState optionExerciseBorrowFeeState, float f, RdsInlineDefinitionTextView view) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(view, "view");
            ScarletManager2.overrideStyle$default(view, new ThemedResourceReference(ResourceType.STYLE.INSTANCE, C20690R.attr.textAppearanceRegularSmall), false, 2, null);
            view.setText(optionExerciseBorrowFeeState.getBorrowFeeText());
            view.setTextSize(f);
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            view.setTextColor(ThemeColors.getThemeColor(context, C20690R.attr.colorForeground2));
            int startIndex = optionExerciseBorrowFeeState.getStartIndex();
            int endIndex = optionExerciseBorrowFeeState.getEndIndex();
            String string2 = view.getContext().getResources().getString(C24704R.string.option_exercise_borrow_fee_inline_tooltip);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            view.setInlineDefinitionSpan(startIndex, endIndex, string2);
            Context context2 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            view.setLinkTextColor(ThemeColors.getThemeColor(context2, C20690R.attr.colorForeground2));
            return Unit.INSTANCE;
        }
    }
}
