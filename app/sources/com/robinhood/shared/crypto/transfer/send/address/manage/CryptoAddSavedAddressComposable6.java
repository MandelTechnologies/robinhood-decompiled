package com.robinhood.shared.crypto.transfer.send.address.manage;

import android.app.Activity;
import android.content.res.Resources;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import androidx.view.OnBackPressedDispatcher;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.shared.crypto.transfer.send.address.UiSavedAddress;
import com.robinhood.shared.crypto.transfer.send.address.saved.SaveAddressSheetContent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoAddSavedAddressComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressComposableKt$ScaffoldComposable$2$4$3, reason: use source file name */
/* loaded from: classes6.dex */
final class CryptoAddSavedAddressComposable6 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ SnapshotState<Boolean> $isSavingAddressBottomSheet$delegate;
    final /* synthetic */ OnBackPressedDispatcher $onBack;
    final /* synthetic */ AddressAdditionBottomSheetState $sheetState;
    final /* synthetic */ SnapshotState<AddressAdditionBottomSheetState> $showAddressAdditionBottomSheet$delegate;

    CryptoAddSavedAddressComposable6(AddressAdditionBottomSheetState addressAdditionBottomSheetState, Activity activity, OnBackPressedDispatcher onBackPressedDispatcher, SnapshotState<AddressAdditionBottomSheetState> snapshotState, SnapshotState<Boolean> snapshotState2) {
        this.$sheetState = addressAdditionBottomSheetState;
        this.$activity = activity;
        this.$onBack = onBackPressedDispatcher;
        this.$showAddressAdditionBottomSheet$delegate = snapshotState;
        this.$isSavingAddressBottomSheet$delegate = snapshotState2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) throws Resources.NotFoundException {
        invoke(rhModalBottomSheet5, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-527543862, i, -1, "com.robinhood.shared.crypto.transfer.send.address.manage.ScaffoldComposable.<anonymous>.<anonymous>.<anonymous> (CryptoAddSavedAddressComposable.kt:193)");
        }
        String address = this.$sheetState.getAddress();
        String strShortenedAddress = UiSavedAddress.INSTANCE.shortenedAddress(this.$sheetState.getAddress());
        String apiCurrencyCode = this.$sheetState.getApiCurrencyCode();
        String currencyCode = this.$sheetState.getCurrencyCode();
        composer.startReplaceGroup(5004770);
        final SnapshotState<AddressAdditionBottomSheetState> snapshotState = this.$showAddressAdditionBottomSheet$delegate;
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressComposableKt$ScaffoldComposable$2$4$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoAddSavedAddressComposable6.invoke$lambda$1$lambda$0(snapshotState);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        final SnapshotState<Boolean> snapshotState2 = this.$isSavingAddressBottomSheet$delegate;
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressComposableKt$ScaffoldComposable$2$4$3$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoAddSavedAddressComposable6.invoke$lambda$3$lambda$2(snapshotState2, ((Boolean) obj).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function1 function1 = (Function1) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(this.$activity) | composer.changedInstance(this.$onBack);
        final Activity activity = this.$activity;
        final OnBackPressedDispatcher onBackPressedDispatcher = this.$onBack;
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressComposableKt$ScaffoldComposable$2$4$3$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoAddSavedAddressComposable6.invoke$lambda$5$lambda$4(activity, onBackPressedDispatcher);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        SaveAddressSheetContent.SaveAddressSheetContent(strShortenedAddress, address, apiCurrencyCode, currencyCode, function0, function1, null, (Function0) objRememberedValue3, null, composer, 221184, EnumC7081g.SDK_ASSET_ILLUSTRATION_ALERT_WARNING_YELLOW_VALUE);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(SnapshotState snapshotState, boolean z) {
        CryptoAddSavedAddressComposable5.ScaffoldComposable$lambda$7(snapshotState, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(Activity activity, OnBackPressedDispatcher onBackPressedDispatcher) {
        if (activity != null) {
            activity.setResult(-1);
        }
        if (onBackPressedDispatcher != null) {
            onBackPressedDispatcher.onBackPressed();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState) {
        CryptoAddSavedAddressComposable5.ScaffoldComposable$lambda$4(snapshotState, null);
        return Unit.INSTANCE;
    }
}
