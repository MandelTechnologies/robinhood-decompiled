package com.robinhood.android.individualaccounts.onboarding.funding;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.individualaccounts.onboarding.C18897R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: IndividualAccountFundingBottomSheetDialogFragment.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\u001ac\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00062\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001a\u001a\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002\u001a\u001a\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002\u001a\u001a\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002\u001a\u001a\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0015¨\u0006\u0016²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u008e\u0002"}, m3636d2 = {"FundAccountBottomSheetContent", "", "accountNumber", "", "source", "type", "Lcom/robinhood/android/individualaccounts/onboarding/funding/FundAccountType;", "onHandleDeeplink", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "onDismissClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/individualaccounts/onboarding/funding/FundAccountType;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "externalAssetsDeeplink", "externalFundsDeeplink", "internalAssetsDeeplink", "internalFundsDeeplink", "FundAccountBottomSheetPreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-individual-account-onboarding_externalDebug", "loading", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.individualaccounts.onboarding.funding.IndividualAccountFundingBottomSheetDialogFragmentKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class IndividualAccountFundingBottomSheetDialogFragment6 {

    /* compiled from: IndividualAccountFundingBottomSheetDialogFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.individualaccounts.onboarding.funding.IndividualAccountFundingBottomSheetDialogFragmentKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IndividualAccountFundingBottomSheetKey2.values().length];
            try {
                iArr[IndividualAccountFundingBottomSheetKey2.ASSETS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IndividualAccountFundingBottomSheetKey2.CASH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FundAccountBottomSheetContent$lambda$8(String str, String str2, IndividualAccountFundingBottomSheetKey2 individualAccountFundingBottomSheetKey2, Function2 function2, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FundAccountBottomSheetContent(str, str2, individualAccountFundingBottomSheetKey2, function2, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FundAccountBottomSheetPreview$lambda$13(int i, Composer composer, int i2) {
        FundAccountBottomSheetPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private static final boolean FundAccountBottomSheetContent$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FundAccountBottomSheetContent(final String accountNumber, final String str, final IndividualAccountFundingBottomSheetKey2 type2, final Function2<? super String, ? super Continuation<? super Unit>, ? extends Object> onHandleDeeplink, final Function0<Unit> onDismissClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        CoroutineScope coroutineScope;
        Object objRememberedValue2;
        SnapshotState snapshotState;
        int i5;
        String strStringResource;
        UserInteractionEventDescriptor userInteractionEventDescriptor;
        BentoTheme bentoTheme;
        int i6;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChangedInstance;
        BentoTheme bentoTheme2;
        final CoroutineScope coroutineScope2;
        Object obj;
        UserInteractionEventDescriptor userInteractionEventDescriptor2;
        int i7;
        final SnapshotState snapshotState2;
        int i8;
        BentoTheme bentoTheme3;
        int i9;
        boolean zChangedInstance2;
        Object objRememberedValue3;
        BentoTheme bentoTheme4;
        int i10;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(onHandleDeeplink, "onHandleDeeplink");
        Intrinsics.checkNotNullParameter(onDismissClick, "onDismissClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1192566961);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(accountNumber) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(type2.ordinal()) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onHandleDeeplink) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onDismissClick) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
                }
                if ((74899 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                } else {
                    if (i4 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1192566961, i3, -1, "com.robinhood.android.individualaccounts.onboarding.funding.FundAccountBottomSheetContent (IndividualAccountFundingBottomSheetDialogFragment.kt:96)");
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    coroutineScope = (CoroutineScope) objRememberedValue;
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    snapshotState = (SnapshotState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    i5 = WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
                    if (i5 != 1) {
                        composerStartRestartGroup.startReplaceGroup(-699405377);
                        strStringResource = StringResources_androidKt.stringResource(C18897R.string.transfer_assets_title, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        if (i5 != 2) {
                            composerStartRestartGroup.startReplaceGroup(-699406786);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(-699402855);
                        strStringResource = StringResources_androidKt.stringResource(C18897R.string.add_money_title, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier2, UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BOTTOM_SHEET, type2 != IndividualAccountFundingBottomSheetKey2.ASSETS ? "add_funds_bottom_sheet_assets" : "add_funds_bottom_sheet_money", null, 4, null), null, 47, null)), true, false, false, false, false, null, 108, null);
                    Modifier modifier4 = modifier2;
                    bentoTheme = BentoTheme.INSTANCE;
                    i6 = BentoTheme.$stable;
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierAutoLogEvents$default, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(strStringResource, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8190);
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                    BentoBaseRowState.Start.Icon icon = new BentoBaseRowState.Start.Icon(ServerToBentoAssetMapper2.BANKING_24, null, null, 6, null);
                    String strStringResource2 = StringResources_androidKt.stringResource(C18897R.string.from_external_acct, composerStartRestartGroup, 0);
                    Component.ComponentType componentType = Component.ComponentType.ROW;
                    Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(companion3, UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, null, null, new Component(componentType, "external_account", null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
                    boolean zFundAccountBottomSheetContent$lambda$1 = FundAccountBottomSheetContent$lambda$1(snapshotState);
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    int i11 = i3 & 896;
                    int i12 = i3 & 14;
                    int i13 = i3 & 112;
                    zChangedInstance = (i11 != 256) | (i12 != 4) | (i13 != 32) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(onHandleDeeplink);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                        bentoTheme2 = bentoTheme;
                        coroutineScope2 = coroutineScope;
                        userInteractionEventDescriptor2 = userInteractionEventDescriptor;
                        i7 = i6;
                        snapshotState2 = snapshotState;
                        i8 = i3;
                        obj = new Function0() { // from class: com.robinhood.android.individualaccounts.onboarding.funding.IndividualAccountFundingBottomSheetDialogFragmentKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return IndividualAccountFundingBottomSheetDialogFragment6.FundAccountBottomSheetContent$lambda$7$lambda$4$lambda$3(type2, accountNumber, str, coroutineScope2, onHandleDeeplink, snapshotState2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(obj);
                    } else {
                        coroutineScope2 = coroutineScope;
                        obj = objRememberedValue4;
                        bentoTheme2 = bentoTheme;
                        userInteractionEventDescriptor2 = userInteractionEventDescriptor;
                        i7 = i6;
                        snapshotState2 = snapshotState;
                        i8 = i3;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    int i14 = BentoBaseRowState.Start.Icon.$stable;
                    bentoTheme3 = bentoTheme2;
                    i9 = i7;
                    BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierAutoLogEvents$default2, icon, strStringResource2, null, null, null, null, false, false, zFundAccountBottomSheetContent$lambda$1, 0L, (Function0) obj, composerStartRestartGroup, i14 << 3, 0, 1528);
                    BentoBaseRowState.Start.Icon icon2 = new BentoBaseRowState.Start.Icon(ServerToBentoAssetMapper2.ROBINHOOD_24, null, null, 6, null);
                    String strStringResource3 = StringResources_androidKt.stringResource(C18897R.string.from_rh_acct, composerStartRestartGroup, 0);
                    Modifier modifierAutoLogEvents$default3 = ModifiersKt.autoLogEvents$default(companion3, UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor2, new UserInteractionEventDescriptor(null, null, null, null, new Component(componentType, "rh_account", null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
                    boolean zFundAccountBottomSheetContent$lambda$12 = FundAccountBottomSheetContent$lambda$1(snapshotState2);
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChangedInstance2 = (i11 != 256) | (i12 != 4) | (i13 != 32) | composerStartRestartGroup.changedInstance(coroutineScope2) | composerStartRestartGroup.changedInstance(onHandleDeeplink);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                        bentoTheme4 = bentoTheme3;
                        i10 = i9;
                        Function0 function0 = new Function0() { // from class: com.robinhood.android.individualaccounts.onboarding.funding.IndividualAccountFundingBottomSheetDialogFragmentKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return IndividualAccountFundingBottomSheetDialogFragment6.FundAccountBottomSheetContent$lambda$7$lambda$6$lambda$5(type2, accountNumber, str, coroutineScope2, onHandleDeeplink, snapshotState2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(function0);
                        objRememberedValue3 = function0;
                    } else {
                        bentoTheme4 = bentoTheme3;
                        i10 = i9;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierAutoLogEvents$default3, icon2, strStringResource3, null, null, null, null, false, false, zFundAccountBottomSheetContent$lambda$12, 0L, (Function0) objRememberedValue3, composerStartRestartGroup, i14 << 3, 0, 1528);
                    composerStartRestartGroup = composerStartRestartGroup;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme4.getSpacing(composerStartRestartGroup, i10).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                    BentoButtonKt.m20586BentoButtonEikTQX8(onDismissClick, StringResources_androidKt.stringResource(C11048R.string.general_label_close, composerStartRestartGroup, 0), com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion3, 0.0f, 1, null), null, BentoButtons.Type.Primary, false, false, null, null, null, null, false, null, composerStartRestartGroup, ((i8 >> 12) & 14) | 24576, 0, 8168);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.individualaccounts.onboarding.funding.IndividualAccountFundingBottomSheetDialogFragmentKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return IndividualAccountFundingBottomSheetDialogFragment6.FundAccountBottomSheetContent$lambda$8(accountNumber, str, type2, onHandleDeeplink, onDismissClick, modifier3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            modifier2 = modifier;
            if ((74899 & i3) == 74898) {
                if (i4 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                coroutineScope = (CoroutineScope) objRememberedValue;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                snapshotState = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                i5 = WhenMappings.$EnumSwitchMapping$0[type2.ordinal()];
                if (i5 != 1) {
                }
                userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                Modifier modifierAutoLogEvents$default4 = ModifiersKt.autoLogEvents$default(modifier2, UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BOTTOM_SHEET, type2 != IndividualAccountFundingBottomSheetKey2.ASSETS ? "add_funds_bottom_sheet_assets" : "add_funds_bottom_sheet_money", null, 4, null), null, 47, null)), true, false, false, false, false, null, 108, null);
                Modifier modifier42 = modifier2;
                bentoTheme = BentoTheme.INSTANCE;
                i6 = BentoTheme.$stable;
                Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(modifierAutoLogEvents$default4, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default2);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(strStringResource, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8190);
                    Modifier.Companion companion32 = Modifier.INSTANCE;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion32, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                    BentoBaseRowState.Start.Icon icon3 = new BentoBaseRowState.Start.Icon(ServerToBentoAssetMapper2.BANKING_24, null, null, 6, null);
                    String strStringResource22 = StringResources_androidKt.stringResource(C18897R.string.from_external_acct, composerStartRestartGroup, 0);
                    Component.ComponentType componentType2 = Component.ComponentType.ROW;
                    Modifier modifierAutoLogEvents$default22 = ModifiersKt.autoLogEvents$default(companion32, UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, null, null, new Component(componentType2, "external_account", null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
                    boolean zFundAccountBottomSheetContent$lambda$13 = FundAccountBottomSheetContent$lambda$1(snapshotState);
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    int i112 = i3 & 896;
                    int i122 = i3 & 14;
                    int i132 = i3 & 112;
                    zChangedInstance = (i112 != 256) | (i122 != 4) | (i132 != 32) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(onHandleDeeplink);
                    Object objRememberedValue42 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance) {
                        bentoTheme2 = bentoTheme;
                        coroutineScope2 = coroutineScope;
                        userInteractionEventDescriptor2 = userInteractionEventDescriptor;
                        i7 = i6;
                        snapshotState2 = snapshotState;
                        i8 = i3;
                        obj = new Function0() { // from class: com.robinhood.android.individualaccounts.onboarding.funding.IndividualAccountFundingBottomSheetDialogFragmentKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return IndividualAccountFundingBottomSheetDialogFragment6.FundAccountBottomSheetContent$lambda$7$lambda$4$lambda$3(type2, accountNumber, str, coroutineScope2, onHandleDeeplink, snapshotState2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(obj);
                        composerStartRestartGroup.endReplaceGroup();
                        int i142 = BentoBaseRowState.Start.Icon.$stable;
                        bentoTheme3 = bentoTheme2;
                        i9 = i7;
                        BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierAutoLogEvents$default22, icon3, strStringResource22, null, null, null, null, false, false, zFundAccountBottomSheetContent$lambda$13, 0L, (Function0) obj, composerStartRestartGroup, i142 << 3, 0, 1528);
                        BentoBaseRowState.Start.Icon icon22 = new BentoBaseRowState.Start.Icon(ServerToBentoAssetMapper2.ROBINHOOD_24, null, null, 6, null);
                        String strStringResource32 = StringResources_androidKt.stringResource(C18897R.string.from_rh_acct, composerStartRestartGroup, 0);
                        Modifier modifierAutoLogEvents$default32 = ModifiersKt.autoLogEvents$default(companion32, UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor2, new UserInteractionEventDescriptor(null, null, null, null, new Component(componentType2, "rh_account", null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
                        boolean zFundAccountBottomSheetContent$lambda$122 = FundAccountBottomSheetContent$lambda$1(snapshotState2);
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        zChangedInstance2 = (i112 != 256) | (i122 != 4) | (i132 != 32) | composerStartRestartGroup.changedInstance(coroutineScope2) | composerStartRestartGroup.changedInstance(onHandleDeeplink);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2) {
                            bentoTheme4 = bentoTheme3;
                            i10 = i9;
                            Function0 function02 = new Function0() { // from class: com.robinhood.android.individualaccounts.onboarding.funding.IndividualAccountFundingBottomSheetDialogFragmentKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return IndividualAccountFundingBottomSheetDialogFragment6.FundAccountBottomSheetContent$lambda$7$lambda$6$lambda$5(type2, accountNumber, str, coroutineScope2, onHandleDeeplink, snapshotState2);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(function02);
                            objRememberedValue3 = function02;
                            composerStartRestartGroup.endReplaceGroup();
                            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierAutoLogEvents$default32, icon22, strStringResource32, null, null, null, null, false, false, zFundAccountBottomSheetContent$lambda$122, 0L, (Function0) objRememberedValue3, composerStartRestartGroup, i142 << 3, 0, 1528);
                            composerStartRestartGroup = composerStartRestartGroup;
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion32, bentoTheme4.getSpacing(composerStartRestartGroup, i10).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                            BentoButtonKt.m20586BentoButtonEikTQX8(onDismissClick, StringResources_androidKt.stringResource(C11048R.string.general_label_close, composerStartRestartGroup, 0), com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion32, 0.0f, 1, null), null, BentoButtons.Type.Primary, false, false, null, null, null, null, false, null, composerStartRestartGroup, ((i8 >> 12) & 14) | 24576, 0, 8168);
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier42;
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FundAccountBottomSheetContent$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FundAccountBottomSheetContent$lambda$7$lambda$4$lambda$3(IndividualAccountFundingBottomSheetKey2 individualAccountFundingBottomSheetKey2, String str, String str2, CoroutineScope coroutineScope, Function2 function2, SnapshotState snapshotState) {
        String strExternalAssetsDeeplink;
        int i = WhenMappings.$EnumSwitchMapping$0[individualAccountFundingBottomSheetKey2.ordinal()];
        if (i == 1) {
            strExternalAssetsDeeplink = externalAssetsDeeplink(str, str2);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            strExternalAssetsDeeplink = externalFundsDeeplink(str, str2);
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new IndividualAccountFundingBottomSheetDialogFragment7(function2, strExternalAssetsDeeplink, snapshotState, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FundAccountBottomSheetContent$lambda$7$lambda$6$lambda$5(IndividualAccountFundingBottomSheetKey2 individualAccountFundingBottomSheetKey2, String str, String str2, CoroutineScope coroutineScope, Function2 function2, SnapshotState snapshotState) {
        String strInternalAssetsDeeplink;
        int i = WhenMappings.$EnumSwitchMapping$0[individualAccountFundingBottomSheetKey2.ordinal()];
        if (i == 1) {
            strInternalAssetsDeeplink = internalAssetsDeeplink(str, str2);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            strInternalAssetsDeeplink = internalFundsDeeplink(str, str2);
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new IndividualAccountFundingBottomSheetDialogFragment8(function2, strInternalAssetsDeeplink, snapshotState, null), 3, null);
        return Unit.INSTANCE;
    }

    private static final String externalAssetsDeeplink(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("robinhood://acats_create");
        sb.append("?account_number=" + str);
        if (str2 != null) {
            sb.append("&source=" + str2);
        }
        return sb.toString();
    }

    private static final String externalFundsDeeplink(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("robinhood://transfer_funds");
        sb.append("?to_account_id=" + str);
        sb.append("&from_account_type=ach_relationship");
        if (str2 != null) {
            sb.append("&entry_point=" + str2);
        }
        return sb.toString();
    }

    private static final String internalAssetsDeeplink(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("robinhood://create_internal_asset_transfer");
        sb.append("?sink_account_number=" + str);
        if (str2 != null) {
            sb.append("&source=" + str2);
        }
        return sb.toString();
    }

    private static final String internalFundsDeeplink(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("robinhood://transfer_funds");
        sb.append("?to_account_id=" + str);
        sb.append("&transfer_direction=inter_entity");
        if (str2 != null) {
            sb.append("&entry_point=" + str2);
        }
        return sb.toString();
    }

    private static final void FundAccountBottomSheetPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1385876162);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1385876162, i, -1, "com.robinhood.android.individualaccounts.onboarding.funding.FundAccountBottomSheetPreview (IndividualAccountFundingBottomSheetDialogFragment.kt:246)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, IndividualAccountFundingBottomSheetDialogFragment2.INSTANCE.m2060x456f74e5(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.individualaccounts.onboarding.funding.IndividualAccountFundingBottomSheetDialogFragmentKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IndividualAccountFundingBottomSheetDialogFragment6.FundAccountBottomSheetPreview$lambda$13(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
