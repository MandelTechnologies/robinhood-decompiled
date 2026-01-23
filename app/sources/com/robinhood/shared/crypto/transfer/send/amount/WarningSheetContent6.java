package com.robinhood.shared.crypto.transfer.send.amount;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.platform.UriHandler;
import androidx.compose.p011ui.platform.WindowInfo;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals3;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoPogContent;
import com.robinhood.compose.bento.component.BentoPogDefaults;
import com.robinhood.compose.bento.component.BentoPogKt;
import com.robinhood.compose.bento.component.BentoPogSize;
import com.robinhood.compose.bento.component.BentoPogState;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoSpacing;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.api.transfer.ApiCryptoTransferWithdrawal;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ComponentHierarchy;
import com.robinhood.shared.crypto.transfer.send.amount.CryptoTransferSendAmountViewState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: WarningSheetContent.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aW\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001a1\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001aU\u0010\u0015\u001a\u00020\u0001*\u00020\u00162\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0019H\u0003¢\u0006\u0002\u0010\u001a\u001a\r\u0010\u001b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001c¨\u0006\u001d"}, m3636d2 = {"WarningSheetContent", "", "Lcom/robinhood/android/common/composebottomsheet/RhModalBottomSheetScope;", "title", "", "descriptionMarkdown", "primaryCta", "Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$WithdrawalWarningButtonState;", "secondaryCta", "onContinue", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "fractionMaxHeight", "", "(Lcom/robinhood/android/common/composebottomsheet/RhModalBottomSheetScope;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$WithdrawalWarningButtonState;Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$WithdrawalWarningButtonState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;FLandroidx/compose/runtime/Composer;II)V", "ScrollableSheetContent", "contentMaxHeight", "Landroidx/compose/ui/unit/Dp;", "ScrollableSheetContent-942rkJo", "(Ljava/lang/String;Ljava/lang/String;FLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ButtonBar", "Landroidx/compose/foundation/layout/ColumnScope;", "onDismiss", "onLinkClicked", "Lkotlin/Function1;", "(Landroidx/compose/foundation/layout/ColumnScope;Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$WithdrawalWarningButtonState;Lcom/robinhood/shared/crypto/transfer/send/amount/CryptoTransferSendAmountViewState$WithdrawalWarningButtonState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "CryptoSendWarningSheetPreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-crypto-transfer_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.send.amount.WarningSheetContentKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class WarningSheetContent6 {

    /* compiled from: WarningSheetContent.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.transfer.send.amount.WarningSheetContentKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiCryptoTransferWithdrawal.PreReviewBottomSheet.ActionType.values().length];
            try {
                iArr[ApiCryptoTransferWithdrawal.PreReviewBottomSheet.ActionType.DISMISS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiCryptoTransferWithdrawal.PreReviewBottomSheet.ActionType.CONTINUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiCryptoTransferWithdrawal.PreReviewBottomSheet.ActionType.DEEPLINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ButtonBar$lambda$14(Column5 column5, CryptoTransferSendAmountViewState.WithdrawalWarningButtonState withdrawalWarningButtonState, CryptoTransferSendAmountViewState.WithdrawalWarningButtonState withdrawalWarningButtonState2, Function0 function0, Function0 function02, Function1 function1, int i, Composer composer, int i2) {
        ButtonBar(column5, withdrawalWarningButtonState, withdrawalWarningButtonState2, function0, function02, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoSendWarningSheetPreview$lambda$15(int i, Composer composer, int i2) {
        CryptoSendWarningSheetPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScrollableSheetContent_942rkJo$lambda$9(String str, String str2, float f, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m25121ScrollableSheetContent942rkJo(str, str2, f, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WarningSheetContent$lambda$6(RhModalBottomSheet5 rhModalBottomSheet5, String str, String str2, CryptoTransferSendAmountViewState.WithdrawalWarningButtonState withdrawalWarningButtonState, CryptoTransferSendAmountViewState.WithdrawalWarningButtonState withdrawalWarningButtonState2, Function0 function0, Modifier modifier, float f, int i, int i2, Composer composer, int i3) {
        WarningSheetContent(rhModalBottomSheet5, str, str2, withdrawalWarningButtonState, withdrawalWarningButtonState2, function0, modifier, f, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WarningSheetContent(final RhModalBottomSheet5 rhModalBottomSheet5, final String title, final String descriptionMarkdown, final CryptoTransferSendAmountViewState.WithdrawalWarningButtonState withdrawalWarningButtonState, final CryptoTransferSendAmountViewState.WithdrawalWarningButtonState withdrawalWarningButtonState2, final Function0<Unit> onContinue, Modifier modifier, float f, Composer composer, final int i, final int i2) {
        int i3;
        CryptoTransferSendAmountViewState.WithdrawalWarningButtonState withdrawalWarningButtonState3;
        CryptoTransferSendAmountViewState.WithdrawalWarningButtonState withdrawalWarningButtonState4;
        Modifier modifier2;
        int i4;
        float f2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Navigator navigator;
        final UriHandler uriHandler;
        final Context context;
        boolean z;
        Object objRememberedValue;
        boolean zChangedInstance;
        Object objRememberedValue2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(rhModalBottomSheet5, "<this>");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(descriptionMarkdown, "descriptionMarkdown");
        Intrinsics.checkNotNullParameter(onContinue, "onContinue");
        Composer composerStartRestartGroup = composer.startRestartGroup(1910420268);
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
            i3 |= composerStartRestartGroup.changed(title) ? 32 : 16;
        }
        if ((i2 & 2) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(descriptionMarkdown) ? 256 : 128;
        }
        if ((i2 & 4) != 0) {
            i3 |= 3072;
            withdrawalWarningButtonState3 = withdrawalWarningButtonState;
        } else {
            withdrawalWarningButtonState3 = withdrawalWarningButtonState;
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(withdrawalWarningButtonState3) ? 2048 : 1024;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 24576;
            withdrawalWarningButtonState4 = withdrawalWarningButtonState2;
        } else {
            withdrawalWarningButtonState4 = withdrawalWarningButtonState2;
            if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changed(withdrawalWarningButtonState4) ? 16384 : 8192;
            }
        }
        if ((i2 & 16) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onContinue) ? 131072 : 65536;
        }
        int i5 = i2 & 32;
        if (i5 != 0) {
            i3 |= 1572864;
        } else {
            if ((1572864 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                if ((12582912 & i) == 0) {
                    f2 = f;
                    i3 |= composerStartRestartGroup.changed(f2) ? 8388608 : 4194304;
                }
                if ((i3 & 4793491) == 4793490 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i4 != 0) {
                        f2 = 0.8f;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1910420268, i3, -1, "com.robinhood.shared.crypto.transfer.send.amount.WarningSheetContent (WarningSheetContent.kt:62)");
                    }
                    composerStartRestartGroup.startReplaceGroup(1962855230);
                    float fMo5013toDpu2uoSUM = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM((int) (((WindowInfo) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g() & 4294967295L));
                    composerStartRestartGroup.endReplaceGroup();
                    float fM7995constructorimpl = C2002Dp.m7995constructorimpl(fMo5013toDpu2uoSUM * f2);
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(modifier4, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BOTTOM_SHEET, "acats_out_clawback_preview_amount", null, 4, null), null, 47, null), true, false, false, false, false, null, 108, null), 0.0f, 1, null), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), BentoSpacing.INSTANCE.m21598default().m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.useNode();
                    } else {
                        composerStartRestartGroup.createNode(constructor);
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
                    int i6 = i3 >> 3;
                    int i7 = i3;
                    m25121ScrollableSheetContent942rkJo(title, descriptionMarkdown, fM7995constructorimpl, null, composerStartRestartGroup, i6 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 8);
                    navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                    uriHandler = (UriHandler) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalUriHandler());
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    int i8 = i7 & 14;
                    z = i8 != 4 || ((i7 & 8) != 0 && composerStartRestartGroup.changedInstance(rhModalBottomSheet5));
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.amount.WarningSheetContentKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return WarningSheetContent6.WarningSheetContent$lambda$5$lambda$2$lambda$1(rhModalBottomSheet5);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    Function0 function0 = (Function0) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChangedInstance = (i8 != 4 || ((i7 & 8) != 0 && composerStartRestartGroup.changedInstance(rhModalBottomSheet5))) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(uriHandler);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.amount.WarningSheetContentKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return WarningSheetContent6.WarningSheetContent$lambda$5$lambda$4$lambda$3(navigator, context, uriHandler, rhModalBottomSheet5, (String) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    int i9 = i7 >> 6;
                    ButtonBar(column6, withdrawalWarningButtonState3, withdrawalWarningButtonState4, function0, onContinue, (Function1) objRememberedValue2, composerStartRestartGroup, 6 | (i9 & 112) | (i9 & 896) | (57344 & i6));
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                }
                final float f3 = f2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.amount.WarningSheetContentKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return WarningSheetContent6.WarningSheetContent$lambda$6(rhModalBottomSheet5, title, descriptionMarkdown, withdrawalWarningButtonState, withdrawalWarningButtonState2, onContinue, modifier3, f3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 12582912;
            f2 = f;
            if ((i3 & 4793491) == 4793490) {
                if (i5 == 0) {
                }
                if (i4 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(1962855230);
                float fMo5013toDpu2uoSUM2 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM((int) (((WindowInfo) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g() & 4294967295L));
                composerStartRestartGroup.endReplaceGroup();
                float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(fMo5013toDpu2uoSUM2 * f2);
                Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(ModifiersKt.autoLogEvents$default(modifier4, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BOTTOM_SHEET, "acats_out_clawback_preview_amount", null, 4, null), null, 47, null), true, false, false, false, false, null, 108, null), 0.0f, 1, null), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), BentoSpacing.INSTANCE.m21598default().m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default2);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    int i62 = i3 >> 3;
                    int i72 = i3;
                    m25121ScrollableSheetContent942rkJo(title, descriptionMarkdown, fM7995constructorimpl2, null, composerStartRestartGroup, i62 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 8);
                    navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                    uriHandler = (UriHandler) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalUriHandler());
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    int i82 = i72 & 14;
                    if (i82 != 4) {
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.amount.WarningSheetContentKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return WarningSheetContent6.WarningSheetContent$lambda$5$lambda$2$lambda$1(rhModalBottomSheet5);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            Function0 function02 = (Function0) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            if (i82 != 4) {
                                zChangedInstance = (i82 != 4 || ((i72 & 8) != 0 && composerStartRestartGroup.changedInstance(rhModalBottomSheet5))) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(uriHandler);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (!zChangedInstance) {
                                    objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.amount.WarningSheetContentKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return WarningSheetContent6.WarningSheetContent$lambda$5$lambda$4$lambda$3(navigator, context, uriHandler, rhModalBottomSheet5, (String) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    composerStartRestartGroup.endReplaceGroup();
                                    int i92 = i72 >> 6;
                                    ButtonBar(column62, withdrawalWarningButtonState3, withdrawalWarningButtonState4, function02, onContinue, (Function1) objRememberedValue2, composerStartRestartGroup, 6 | (i92 & 112) | (i92 & 896) | (57344 & i62));
                                    composerStartRestartGroup = composerStartRestartGroup;
                                    composerStartRestartGroup.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier3 = modifier4;
                                }
                            }
                        }
                    }
                }
            }
            final float f32 = f2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 64;
        if (i4 != 0) {
        }
        f2 = f;
        if ((i3 & 4793491) == 4793490) {
        }
        final float f322 = f2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WarningSheetContent$lambda$5$lambda$2$lambda$1(RhModalBottomSheet5 rhModalBottomSheet5) {
        RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WarningSheetContent$lambda$5$lambda$4$lambda$3(Navigator navigator, Context context, UriHandler uriHandler, RhModalBottomSheet5 rhModalBottomSheet5, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Uri uri = Uri.parse(it);
        Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
        if (navigator.isDeepLinkSupported(uri)) {
            Navigator.DefaultImpls.handleDeepLink$default(navigator, context, Uri.parse(it), null, null, false, null, 60, null);
        } else {
            uriHandler.openUri(it);
        }
        RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* renamed from: ScrollableSheetContent-942rkJo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m25121ScrollableSheetContent942rkJo(final String str, final String str2, final float f, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1899312552);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(f) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1899312552, i3, -1, "com.robinhood.shared.crypto.transfer.send.amount.ScrollableSheetContent (WarningSheetContent.kt:117)");
                    }
                    BentoSpacing bentoSpacingM21598default = BentoSpacing.INSTANCE.m21598default();
                    Modifier modifierM5157heightInVpY3zN4 = SizeKt.m5157heightInVpY3zN4(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), C2002Dp.m7995constructorimpl(0), f);
                    Alignment.Companion companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5157heightInVpY3zN4);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(ScrollKt.verticalScroll$default(companion3, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion.getCenterHorizontally(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoSpacingM21598default.m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                    BentoPogKt.BentoPog(new BentoPogState(new BentoPogContent.Pictogram(C20690R.drawable.pict_mono_rds_warning, null, null, 4, null), BentoPogDefaults.INSTANCE.getDefaultColors(composerStartRestartGroup, BentoPogDefaults.$stable), BentoPogSize.Hero, false, false, null, null, 120, null), null, composerStartRestartGroup, BentoPogState.$stable, 2);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoSpacingM21598default.m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                    AnnotatedString annotatedString = new AnnotatedString(str, null, 2, null);
                    TextAlign.Companion companion4 = TextAlign.INSTANCE;
                    int iM7919getCentere0LSkKk = companion4.m7919getCentere0LSkKk();
                    TextStyle displayCapsuleSmall = BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getDisplayCapsuleSmall();
                    Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, bentoSpacingM21598default.m21593getSmallD9Ej5fM(), 7, null), "title");
                    TextAlign textAlignM7912boximpl = TextAlign.m7912boximpl(iM7919getCentere0LSkKk);
                    Modifier modifier5 = modifier4;
                    BentoText2.m20748BentoTextQnj7Zds(annotatedString, modifierTestTag, null, null, null, null, textAlignM7912boximpl, 0, false, 0, 0, null, null, displayCapsuleSmall, composerStartRestartGroup, 0, 0, 8124);
                    composerStartRestartGroup = composerStartRestartGroup;
                    BentoMarkdownText2.BentoMarkdownText(str2, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(null, companion4.m7919getCentere0LSkKk(), 0L, 0L, false, composerStartRestartGroup, BentoMarkdownText.$stable << 15, 29), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composerStartRestartGroup, ((i3 >> 3) & 14) | (MarkdownStyle.$stable << 6), 26);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoSpacingM21598default.m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.amount.WarningSheetContentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return WarningSheetContent6.ScrollableSheetContent_942rkJo$lambda$9(str, str2, f, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            modifier2 = modifier;
            if ((i3 & 1171) == 1170) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                BentoSpacing bentoSpacingM21598default2 = BentoSpacing.INSTANCE.m21598default();
                Modifier modifierM5157heightInVpY3zN42 = SizeKt.m5157heightInVpY3zN4(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), C2002Dp.m7995constructorimpl(0), f);
                Alignment.Companion companion5 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5157heightInVpY3zN42);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    Modifier.Companion companion32 = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(ScrollKt.verticalScroll$default(companion32, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion5.getCenterHorizontally(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
                    Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                        Column6 column62 = Column6.INSTANCE;
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion32, bentoSpacingM21598default2.m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                        BentoPogKt.BentoPog(new BentoPogState(new BentoPogContent.Pictogram(C20690R.drawable.pict_mono_rds_warning, null, null, 4, null), BentoPogDefaults.INSTANCE.getDefaultColors(composerStartRestartGroup, BentoPogDefaults.$stable), BentoPogSize.Hero, false, false, null, null, 120, null), null, composerStartRestartGroup, BentoPogState.$stable, 2);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion32, bentoSpacingM21598default2.m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                        AnnotatedString annotatedString2 = new AnnotatedString(str, null, 2, null);
                        TextAlign.Companion companion42 = TextAlign.INSTANCE;
                        int iM7919getCentere0LSkKk2 = companion42.m7919getCentere0LSkKk();
                        TextStyle displayCapsuleSmall2 = BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getDisplayCapsuleSmall();
                        Modifier modifierTestTag2 = TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(companion32, 0.0f, 0.0f, 0.0f, bentoSpacingM21598default2.m21593getSmallD9Ej5fM(), 7, null), "title");
                        TextAlign textAlignM7912boximpl2 = TextAlign.m7912boximpl(iM7919getCentere0LSkKk2);
                        Modifier modifier52 = modifier4;
                        BentoText2.m20748BentoTextQnj7Zds(annotatedString2, modifierTestTag2, null, null, null, null, textAlignM7912boximpl2, 0, false, 0, 0, null, null, displayCapsuleSmall2, composerStartRestartGroup, 0, 0, 8124);
                        composerStartRestartGroup = composerStartRestartGroup;
                        BentoMarkdownText2.BentoMarkdownText(str2, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(null, companion42.m7919getCentere0LSkKk(), 0L, 0L, false, composerStartRestartGroup, BentoMarkdownText.$stable << 15, 29), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composerStartRestartGroup, ((i3 >> 3) & 14) | (MarkdownStyle.$stable << 6), 26);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion32, bentoSpacingM21598default2.m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final void ButtonBar(final Column5 column5, final CryptoTransferSendAmountViewState.WithdrawalWarningButtonState withdrawalWarningButtonState, final CryptoTransferSendAmountViewState.WithdrawalWarningButtonState withdrawalWarningButtonState2, final Function0<Unit> function0, final Function0<Unit> function02, final Function1<? super String, Unit> function1, Composer composer, final int i) {
        int i2;
        BentoSpacing bentoSpacing;
        int i3;
        float f;
        Object obj;
        Composer composer2;
        int i4;
        Composer composer3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-29487962);
        if ((i & 48) == 0) {
            i2 = (composerStartRestartGroup.changed(withdrawalWarningButtonState) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(withdrawalWarningButtonState2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 131072 : 65536;
        }
        if ((74897 & i2) != 74896 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-29487962, i2, -1, "com.robinhood.shared.crypto.transfer.send.amount.ButtonBar (WarningSheetContent.kt:168)");
            }
            BentoSpacing bentoSpacingM21598default = BentoSpacing.INSTANCE.m21598default();
            composerStartRestartGroup.startReplaceGroup(1726852731);
            if (withdrawalWarningButtonState != null) {
                String text = withdrawalWarningButtonState.getText();
                Modifier modifierTestTag = TestTag3.testTag(SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, AutoLoggingCompositionLocals3.INSTANCE.getEventContext(composerStartRestartGroup, AutoLoggingCompositionLocals3.$stable), new Component(Component.ComponentType.BUTTON, withdrawalWarningButtonState.getText(), null, 4, null), new ComponentHierarchy(new Component(Component.ComponentType.BOTTOM_SHEET, "acats_out_clawback_preview_amount", null, 4, null), null, null, null, null, 30, null), 7, null), false, false, false, true, false, null, 108, null), 0.0f, 0.0f, 0.0f, bentoSpacingM21598default.m21593getSmallD9Ej5fM(), 7, null), 0.0f, 1, null), WarningSheetContent5.TEST_TAG_PRIMARY_CTA);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                boolean z = ((i2 & 112) == 32) | ((i2 & 7168) == 2048) | ((i2 & 57344) == 16384) | ((i2 & 458752) == 131072);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.amount.WarningSheetContentKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return WarningSheetContent6.ButtonBar$lambda$11$lambda$10(withdrawalWarningButtonState, function0, function02, function1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                bentoSpacing = bentoSpacingM21598default;
                i3 = i2;
                obj = null;
                f = 0.0f;
                i4 = 1;
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, text, modifierTestTag, null, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, 0, 0, 8184);
                composer2 = composerStartRestartGroup;
            } else {
                bentoSpacing = bentoSpacingM21598default;
                i3 = i2;
                f = 0.0f;
                obj = null;
                composer2 = composerStartRestartGroup;
                i4 = 1;
            }
            composer2.endReplaceGroup();
            if (withdrawalWarningButtonState2 != null) {
                String text2 = withdrawalWarningButtonState2.getText();
                Modifier modifierTestTag2 = TestTag3.testTag(SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, AutoLoggingCompositionLocals3.INSTANCE.getEventContext(composer2, AutoLoggingCompositionLocals3.$stable), new Component(Component.ComponentType.BUTTON, withdrawalWarningButtonState2.getText(), null, 4, null), new ComponentHierarchy(new Component(Component.ComponentType.BOTTOM_SHEET, "acats_out_clawback_preview_amount", null, 4, null), null, null, null, null, 30, null), 7, null), false, false, false, true, false, null, 108, null), 0.0f, 0.0f, 0.0f, bentoSpacing.m21590getDefaultD9Ej5fM(), 7, null), f, i4, obj), WarningSheetContent5.TEST_TAG_SECONDARY_CTA);
                BentoButtons.Type type2 = BentoButtons.Type.Secondary;
                composer2.startReplaceGroup(-1224400529);
                int i5 = i3;
                int i6 = ((i5 & 7168) == 2048 ? i4 : 0) | ((i5 & 896) == 256 ? i4 : 0) | ((i5 & 57344) == 16384 ? i4 : 0) | ((i5 & 458752) == 131072 ? i4 : 0);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (i6 != 0 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.amount.WarningSheetContentKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return WarningSheetContent6.ButtonBar$lambda$13$lambda$12(withdrawalWarningButtonState2, function0, function02, function1);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceGroup();
                composer3 = composer2;
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, text2, modifierTestTag2, null, type2, false, false, null, null, null, null, false, null, composer3, 24576, 0, 8168);
            } else {
                composer3 = composer2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer3 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.amount.WarningSheetContentKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return WarningSheetContent6.ButtonBar$lambda$14(column5, withdrawalWarningButtonState, withdrawalWarningButtonState2, function0, function02, function1, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ButtonBar$lambda$11$lambda$10(CryptoTransferSendAmountViewState.WithdrawalWarningButtonState withdrawalWarningButtonState, Function0 function0, Function0 function02, Function1 function1) {
        int i = WhenMappings.$EnumSwitchMapping$0[withdrawalWarningButtonState.getAction().ordinal()];
        if (i == 1) {
            function0.invoke();
        } else if (i == 2) {
            function02.invoke();
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (withdrawalWarningButtonState.getDeeplink() == null) {
                function0.invoke();
            } else {
                function1.invoke(withdrawalWarningButtonState.getDeeplink());
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ButtonBar$lambda$13$lambda$12(CryptoTransferSendAmountViewState.WithdrawalWarningButtonState withdrawalWarningButtonState, Function0 function0, Function0 function02, Function1 function1) {
        int i = WhenMappings.$EnumSwitchMapping$0[withdrawalWarningButtonState.getAction().ordinal()];
        if (i == 1) {
            function0.invoke();
        } else if (i == 2) {
            function02.invoke();
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (withdrawalWarningButtonState.getDeeplink() == null) {
                function0.invoke();
            } else {
                function1.invoke(withdrawalWarningButtonState.getDeeplink());
            }
        }
        return Unit.INSTANCE;
    }

    private static final void CryptoSendWarningSheetPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(966108340);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(966108340, i, -1, "com.robinhood.shared.crypto.transfer.send.amount.CryptoSendWarningSheetPreview (WarningSheetContent.kt:268)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, WarningSheetContent2.INSTANCE.m25095getLambda$990412292$feature_crypto_transfer_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.amount.WarningSheetContentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WarningSheetContent6.CryptoSendWarningSheetPreview$lambda$15(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
