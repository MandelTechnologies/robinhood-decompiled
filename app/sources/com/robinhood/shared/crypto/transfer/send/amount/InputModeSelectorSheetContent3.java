package com.robinhood.shared.crypto.transfer.send.amount;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InputModeSelectorSheetContent.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"InputModeSelectorSheetContent", "", "Lcom/robinhood/android/common/composebottomsheet/RhModalBottomSheetScope;", "state", "Lcom/robinhood/shared/crypto/transfer/send/amount/InputModeSelectorSheetContentState;", "modifier", "Landroidx/compose/ui/Modifier;", "onInputModeSelected", "Lkotlin/Function1;", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "(Lcom/robinhood/android/common/composebottomsheet/RhModalBottomSheetScope;Lcom/robinhood/shared/crypto/transfer/send/amount/InputModeSelectorSheetContentState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "feature-crypto-transfer_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.send.amount.InputModeSelectorSheetContentKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class InputModeSelectorSheetContent3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputModeSelectorSheetContent$lambda$5(RhModalBottomSheet5 rhModalBottomSheet5, InputModeSelectorSheetContentState inputModeSelectorSheetContentState, Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        InputModeSelectorSheetContent(rhModalBottomSheet5, inputModeSelectorSheetContentState, modifier, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0258  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InputModeSelectorSheetContent(final RhModalBottomSheet5 rhModalBottomSheet5, final InputModeSelectorSheetContentState state, Modifier modifier, final Function1<? super CryptoInputMode, Unit> onInputModeSelected, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z;
        Object objRememberedValue;
        boolean z2;
        Object objRememberedValue2;
        final InputModeSelectorSheetContentState inputModeSelectorSheetContentState;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(rhModalBottomSheet5, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onInputModeSelected, "onInputModeSelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(2111016008);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(rhModalBottomSheet5) : composerStartRestartGroup.changedInstance(rhModalBottomSheet5) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i2 & 4) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onInputModeSelected) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2111016008, i3, -1, "com.robinhood.shared.crypto.transfer.send.amount.InputModeSelectorSheetContent (InputModeSelectorSheetContent.kt:29)");
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                Modifier modifier5 = modifier4;
                int i6 = i3;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C37934R.string.crypto_input_mode_selector_title, composerStartRestartGroup, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8190);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                int i7 = i6 & 7168;
                int i8 = i6 & 14;
                z = (i7 != 2048) | (i8 != 4 || ((i6 & 8) != 0 && composerStartRestartGroup.changedInstance(rhModalBottomSheet5)));
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.amount.InputModeSelectorSheetContentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return InputModeSelectorSheetContent3.InputModeSelectorSheetContent$lambda$4$lambda$1$lambda$0(onInputModeSelected, rhModalBottomSheet5);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoBaseRowLayout.BentoBaseRowLayout(ClickableKt.m4893clickableXHw0xAI$default(companion2, false, null, null, (Function0) objRememberedValue, 7, null), null, ComposableLambda3.rememberComposableLambda(292764922, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.amount.InputModeSelectorSheetContentKt$InputModeSelectorSheetContent$1$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i9) {
                        if ((i9 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(292764922, i9, -1, "com.robinhood.shared.crypto.transfer.send.amount.InputModeSelectorSheetContent.<anonymous>.<anonymous> (InputModeSelectorSheetContent.kt:46)");
                        }
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(state.getQuoteRowLeadingIcon()), null, BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21425getFg0d7_KjU(), null, null, false, composer3, BentoIcon4.Size24.$stable | 48, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1649344133, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.amount.InputModeSelectorSheetContentKt$InputModeSelectorSheetContent$1$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i9) {
                        if ((i9 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1649344133, i9, -1, "com.robinhood.shared.crypto.transfer.send.amount.InputModeSelectorSheetContent.<anonymous>.<anonymous> (InputModeSelectorSheetContent.kt:53)");
                        }
                        BentoText2.m20747BentoText38GnDrw(StringResource2.getString(state.getQuoteRowPrimaryText(), composer3, StringResource.$stable), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16382);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(703514108, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.amount.InputModeSelectorSheetContentKt$InputModeSelectorSheetContent$1$4
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i9) {
                        if ((i9 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(703514108, i9, -1, "com.robinhood.shared.crypto.transfer.send.amount.InputModeSelectorSheetContent.<anonymous>.<anonymous> (InputModeSelectorSheetContent.kt:56)");
                        }
                        String string2 = StringResource2.getString(state.getQuoteRowSecondaryText(), composer3, StringResource.$stable);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i10 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(string2, null, Color.m6701boximpl(bentoTheme2.getColors(composer3, i10).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i10).getTextS(), composer3, 0, 0, 8186);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, false, false, false, null, composerStartRestartGroup, 28032, 0, 2018);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                z2 = (i8 != 4 || ((i6 & 8) != 0 && composerStartRestartGroup.changedInstance(rhModalBottomSheet5))) | (i7 != 2048);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.amount.InputModeSelectorSheetContentKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return InputModeSelectorSheetContent3.InputModeSelectorSheetContent$lambda$4$lambda$3$lambda$2(onInputModeSelected, rhModalBottomSheet5);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                inputModeSelectorSheetContentState = state;
                BentoBaseRowLayout.BentoBaseRowLayout(ClickableKt.m4893clickableXHw0xAI$default(companion2, false, null, null, (Function0) objRememberedValue2, 7, null), null, InputModeSelectorSheetContent.INSTANCE.m25093getLambda$1330673167$feature_crypto_transfer_externalDebug(), ComposableLambda3.rememberComposableLambda(613298738, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.amount.InputModeSelectorSheetContentKt$InputModeSelectorSheetContent$1$6
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i9) {
                        if ((i9 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(613298738, i9, -1, "com.robinhood.shared.crypto.transfer.send.amount.InputModeSelectorSheetContent.<anonymous>.<anonymous> (InputModeSelectorSheetContent.kt:76)");
                        }
                        BentoText2.m20747BentoText38GnDrw(StringResource2.getString(inputModeSelectorSheetContentState.getAssetRowPrimaryText(), composer3, StringResource.$stable), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16382);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1737696653, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.amount.InputModeSelectorSheetContentKt$InputModeSelectorSheetContent$1$7
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i9) {
                        if ((i9 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1737696653, i9, -1, "com.robinhood.shared.crypto.transfer.send.amount.InputModeSelectorSheetContent.<anonymous>.<anonymous> (InputModeSelectorSheetContent.kt:79)");
                        }
                        String string2 = StringResource2.getString(inputModeSelectorSheetContentState.getAssetRowSecondaryText(), composer3, StringResource.$stable);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i10 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(string2, null, Color.m6701boximpl(bentoTheme2.getColors(composer3, i10).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i10).getTextS(), composer3, 0, 0, 8186);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, false, false, false, null, composerStartRestartGroup, 12610944, 0, 1890);
                composer2 = composerStartRestartGroup;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM()), composer2, 0);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                inputModeSelectorSheetContentState = state;
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final InputModeSelectorSheetContentState inputModeSelectorSheetContentState2 = inputModeSelectorSheetContentState;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.amount.InputModeSelectorSheetContentKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InputModeSelectorSheetContent3.InputModeSelectorSheetContent$lambda$5(rhModalBottomSheet5, inputModeSelectorSheetContentState2, modifier3, onInputModeSelected, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion22 = Modifier.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                Modifier modifier52 = modifier4;
                int i62 = i3;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C37934R.string.crypto_input_mode_selector_title, composerStartRestartGroup, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8190);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                int i72 = i62 & 7168;
                int i82 = i62 & 14;
                if (i82 != 4) {
                    z = (i72 != 2048) | (i82 != 4 || ((i62 & 8) != 0 && composerStartRestartGroup.changedInstance(rhModalBottomSheet5)));
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.amount.InputModeSelectorSheetContentKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return InputModeSelectorSheetContent3.InputModeSelectorSheetContent$lambda$4$lambda$1$lambda$0(onInputModeSelected, rhModalBottomSheet5);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        BentoBaseRowLayout.BentoBaseRowLayout(ClickableKt.m4893clickableXHw0xAI$default(companion22, false, null, null, (Function0) objRememberedValue, 7, null), null, ComposableLambda3.rememberComposableLambda(292764922, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.amount.InputModeSelectorSheetContentKt$InputModeSelectorSheetContent$1$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i9) {
                                if ((i9 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(292764922, i9, -1, "com.robinhood.shared.crypto.transfer.send.amount.InputModeSelectorSheetContent.<anonymous>.<anonymous> (InputModeSelectorSheetContent.kt:46)");
                                }
                                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(state.getQuoteRowLeadingIcon()), null, BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21425getFg0d7_KjU(), null, null, false, composer3, BentoIcon4.Size24.$stable | 48, 56);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1649344133, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.amount.InputModeSelectorSheetContentKt$InputModeSelectorSheetContent$1$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i9) {
                                if ((i9 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1649344133, i9, -1, "com.robinhood.shared.crypto.transfer.send.amount.InputModeSelectorSheetContent.<anonymous>.<anonymous> (InputModeSelectorSheetContent.kt:53)");
                                }
                                BentoText2.m20747BentoText38GnDrw(StringResource2.getString(state.getQuoteRowPrimaryText(), composer3, StringResource.$stable), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16382);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(703514108, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.amount.InputModeSelectorSheetContentKt$InputModeSelectorSheetContent$1$4
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i9) {
                                if ((i9 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(703514108, i9, -1, "com.robinhood.shared.crypto.transfer.send.amount.InputModeSelectorSheetContent.<anonymous>.<anonymous> (InputModeSelectorSheetContent.kt:56)");
                                }
                                String string2 = StringResource2.getString(state.getQuoteRowSecondaryText(), composer3, StringResource.$stable);
                                BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                                int i10 = BentoTheme.$stable;
                                BentoText2.m20747BentoText38GnDrw(string2, null, Color.m6701boximpl(bentoTheme22.getColors(composer3, i10).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme22.getTypography(composer3, i10).getTextS(), composer3, 0, 0, 8186);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), null, null, false, false, false, null, composerStartRestartGroup, 28032, 0, 2018);
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        if (i72 != 2048) {
                        }
                        if (i82 != 4) {
                            z2 = (i82 != 4 || ((i62 & 8) != 0 && composerStartRestartGroup.changedInstance(rhModalBottomSheet5))) | (i72 != 2048);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!z2) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.amount.InputModeSelectorSheetContentKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return InputModeSelectorSheetContent3.InputModeSelectorSheetContent$lambda$4$lambda$3$lambda$2(onInputModeSelected, rhModalBottomSheet5);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                composerStartRestartGroup.endReplaceGroup();
                                inputModeSelectorSheetContentState = state;
                                BentoBaseRowLayout.BentoBaseRowLayout(ClickableKt.m4893clickableXHw0xAI$default(companion22, false, null, null, (Function0) objRememberedValue2, 7, null), null, InputModeSelectorSheetContent.INSTANCE.m25093getLambda$1330673167$feature_crypto_transfer_externalDebug(), ComposableLambda3.rememberComposableLambda(613298738, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.amount.InputModeSelectorSheetContentKt$InputModeSelectorSheetContent$1$6
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i9) {
                                        if ((i9 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(613298738, i9, -1, "com.robinhood.shared.crypto.transfer.send.amount.InputModeSelectorSheetContent.<anonymous>.<anonymous> (InputModeSelectorSheetContent.kt:76)");
                                        }
                                        BentoText2.m20747BentoText38GnDrw(StringResource2.getString(inputModeSelectorSheetContentState.getAssetRowPrimaryText(), composer3, StringResource.$stable), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16382);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1737696653, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.amount.InputModeSelectorSheetContentKt$InputModeSelectorSheetContent$1$7
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i9) {
                                        if ((i9 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1737696653, i9, -1, "com.robinhood.shared.crypto.transfer.send.amount.InputModeSelectorSheetContent.<anonymous>.<anonymous> (InputModeSelectorSheetContent.kt:79)");
                                        }
                                        String string2 = StringResource2.getString(inputModeSelectorSheetContentState.getAssetRowSecondaryText(), composer3, StringResource.$stable);
                                        BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                                        int i10 = BentoTheme.$stable;
                                        BentoText2.m20747BentoText38GnDrw(string2, null, Color.m6701boximpl(bentoTheme22.getColors(composer3, i10).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme22.getTypography(composer3, i10).getTextS(), composer3, 0, 0, 8186);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54), null, null, false, false, false, null, composerStartRestartGroup, 12610944, 0, 1890);
                                composer2 = composerStartRestartGroup;
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composer2, i52).m21592getMediumD9Ej5fM()), composer2, 0);
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier52;
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputModeSelectorSheetContent$lambda$4$lambda$1$lambda$0(Function1 function1, RhModalBottomSheet5 rhModalBottomSheet5) {
        function1.invoke(CryptoInputMode.QUOTE_CURRENCY);
        RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputModeSelectorSheetContent$lambda$4$lambda$3$lambda$2(Function1 function1, RhModalBottomSheet5 rhModalBottomSheet5) {
        function1.invoke(CryptoInputMode.ASSET_CURRENCY);
        RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
        return Unit.INSTANCE;
    }
}
