package com.robinhood.android.transfers.deeplink;

import android.annotation.SuppressLint;
import android.content.Intent;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.history.contracts.DetailType;
import com.robinhood.android.history.contracts.LegacyDetailFragmentKey;
import com.robinhood.android.home.contracts.WatchListIntentKey;
import com.robinhood.android.home.contracts.WatchListIntentKey2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.FragmentTab;
import com.robinhood.shared.history.contracts.account.AccountsHistoryContract;
import com.robinhood.shared.history.contracts.account.AccountsHistoryTransactionTypeFilter;
import com.robinhood.utils.extensions.StringsKt;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TransfersDeeplinkTargets.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/transfers/deeplink/TransfersDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SuppressLint({"DeeplinkTargetHasRegionGate"})
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.deeplink.TransfersDeeplinkTarget, reason: use source file name */
/* loaded from: classes9.dex */
public final class TransfersDeeplinkTargets4 extends DeeplinkTarget4 {
    public static final TransfersDeeplinkTargets4 INSTANCE = new TransfersDeeplinkTargets4();
    public static final int $stable = 8;

    private TransfersDeeplinkTargets4() {
        super("transfers", false, false, false, true, false, null, 102, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011e  */
    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        UUID uuid;
        UUID uuid2;
        Tuples2 tuples2M3642to;
        Intrinsics.checkNotNullParameter(deeplinkContext, "deeplinkContext");
        String queryParameter = deeplinkContext.getUri().getQueryParameter("id");
        if (queryParameter != null) {
            try {
                uuid = StringsKt.toUuid(queryParameter);
            } catch (IllegalArgumentException unused) {
                uuid = null;
            }
            uuid2 = uuid;
        } else {
            uuid2 = null;
        }
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("type");
        String queryParameter3 = deeplinkContext.getUri().getQueryParameter("is_standalone");
        boolean z = queryParameter3 != null ? Boolean.parseBoolean(queryParameter3) : false;
        if (uuid2 == null) {
            if (z) {
                return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new AccountsHistoryContract.Key(null, AccountsHistoryTransactionTypeFilter.TRANSFERS, null, null, false, null, 61, null), false, false, false, null, false, false, false, false, false, null, false, 8188, null)};
            }
            return new Intent[]{Navigator.DefaultImpls.createIntent$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), new WatchListIntentKey(WatchListIntentKey2.TRANSFERS), null, true, 4, null)};
        }
        if (queryParameter2 != null) {
            switch (queryParameter2.hashCode()) {
                case -1540062404:
                    if (!queryParameter2.equals("payment_hub")) {
                        tuples2M3642to = Tuples4.m3642to(DetailType.ACH_TRANSFER, null);
                        break;
                    } else {
                        tuples2M3642to = Tuples4.m3642to(DetailType.PAYMENT_HUB, FragmentTab.SPENDING);
                        break;
                    }
                case -584368636:
                    if (queryParameter2.equals("i18n_wire_transfer")) {
                        tuples2M3642to = Tuples4.m3642to(DetailType.PAYMENT_INTENT, null);
                        break;
                    }
                    break;
                case -330734621:
                    if (queryParameter2.equals("sg_bank_transfer")) {
                        tuples2M3642to = Tuples4.m3642to(DetailType.PAYMENT_INTENT, null);
                        break;
                    }
                    break;
                case 99271:
                    if (queryParameter2.equals("dcf")) {
                        tuples2M3642to = Tuples4.m3642to(DetailType.DEBIT_CARD_TRANSFER, null);
                        break;
                    }
                    break;
                case 109248:
                    if (queryParameter2.equals("noa")) {
                        tuples2M3642to = Tuples4.m3642to(DetailType.NON_ORIGINATED_ACH_TRANSFER, null);
                        break;
                    }
                    break;
                case 112828:
                    if (queryParameter2.equals("rfp")) {
                        tuples2M3642to = Tuples4.m3642to(DetailType.INSTANT_BANK_TRANSFER, null);
                        break;
                    }
                    break;
                case 113262:
                    if (!queryParameter2.equals("rtp")) {
                    }
                    break;
                case 3649669:
                    if (queryParameter2.equals("wire")) {
                        tuples2M3642to = Tuples4.m3642to(DetailType.WIRE_TRANSFER, null);
                        break;
                    }
                    break;
                case 89684344:
                    if (queryParameter2.equals("outgoing_wire")) {
                        tuples2M3642to = Tuples4.m3642to(DetailType.OUTGOING_WIRE_TRANSFER, null);
                        break;
                    }
                    break;
                case 94627080:
                    if (queryParameter2.equals("check")) {
                        tuples2M3642to = Tuples4.m3642to(DetailType.CHECK_TRANSFER, null);
                        break;
                    }
                    break;
                case 383436965:
                    if (queryParameter2.equals("uk_bank_transfer")) {
                        tuples2M3642to = Tuples4.m3642to(DetailType.UK_BANK_TRANSFER, null);
                        break;
                    }
                    break;
                case 570410685:
                    if (queryParameter2.equals("internal")) {
                        tuples2M3642to = Tuples4.m3642to(DetailType.INTERNAL, null);
                        break;
                    }
                    break;
                case 1402572880:
                    if (queryParameter2.equals("uk_open_banking_transfer")) {
                        tuples2M3642to = Tuples4.m3642to(DetailType.UK_OPEN_BANKING_TRANSFER, null);
                        break;
                    }
                    break;
            }
        }
        return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(deeplinkContext.getNavigator(), deeplinkContext.getContext(), LegacyDetailFragmentKey.Companion.from$default(LegacyDetailFragmentKey.INSTANCE, (DetailType) tuples2M3642to.component1(), uuid2, null, true, 4, null), false, false, false, (FragmentTab) tuples2M3642to.component2(), false, false, false, false, false, null, false, 8156, null)};
    }
}
