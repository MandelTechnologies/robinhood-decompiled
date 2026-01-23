package com.robinhood.android.deeplink.targets;

import android.content.Context;
import android.content.Intent;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.deeplink.DeepLinkPath;
import com.robinhood.android.deeplink.DeeplinkTarget2;
import com.robinhood.android.deeplink.DeeplinkTarget4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.shared.history.contracts.AllHistoryFragmentKey;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.utils.extensions.StringsKt;
import java.util.EnumSet;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Targets.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/deeplink/targets/CardTransactionHistoryDeeplinkTarget;", "Lcom/robinhood/android/deeplink/LegacyDeeplinkTarget;", "<init>", "()V", "getIntents", "", "Landroid/content/Intent;", "deeplinkContext", "Lcom/robinhood/android/deeplink/DeeplinkContext;", "(Lcom/robinhood/android/deeplink/DeeplinkContext;)[Landroid/content/Intent;", "lib-deeplink-targets_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CardTransactionHistoryDeeplinkTarget extends DeeplinkTarget4 {
    public static final CardTransactionHistoryDeeplinkTarget INSTANCE = new CardTransactionHistoryDeeplinkTarget();
    public static final int $stable = 8;

    private CardTransactionHistoryDeeplinkTarget() {
        super(DeepLinkPath.CARD_TRANSACTION_HISTORY.getPath(), false, false, false, true, false, null, 102, null);
    }

    @Override // com.robinhood.android.deeplink.DeeplinkTarget
    public Intent[] getIntents(DeeplinkTarget2 deeplinkContext) {
        UUID uuid;
        UUID uuid2;
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
        String queryParameter2 = deeplinkContext.getUri().getQueryParameter("is_standalone");
        boolean z = queryParameter2 != null ? Boolean.parseBoolean(queryParameter2) : false;
        Navigator navigator = deeplinkContext.getNavigator();
        Context context = deeplinkContext.getContext();
        EnumSet enumSetOf = EnumSet.of(AllHistoryFragmentKey.Filter.DEBIT_CARD);
        Intrinsics.checkNotNullExpressionValue(enumSetOf, "of(...)");
        return new Intent[]{Navigator.DefaultImpls.createIntentForFragment$default(navigator, context, new AllHistoryFragmentKey(enumSetOf, null, uuid2 != null ? new TransactionReference(uuid2, HistoryTransactionType.DECLINED_CARD_TRANSACTION, null, null, false, 28, null) : null, null, false, null, true, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE, null), false, !z, false, null, false, z, false, false, false, null, false, 8052, null)};
    }
}
