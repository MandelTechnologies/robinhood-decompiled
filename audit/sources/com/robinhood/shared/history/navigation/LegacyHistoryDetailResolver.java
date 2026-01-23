package com.robinhood.shared.history.navigation;

import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.singular.sdk.internal.SLRemoteConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LegacyHistoryDetailResolver.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ&\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H&¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/history/navigation/LegacyHistoryDetailResolver;", "", SLRemoteConfiguration.Constants.RESOLVE_JSON_KEY, "Lcom/robinhood/android/navigation/keys/FragmentKey;", "transactionReference", "Lcom/robinhood/shared/models/history/shared/TransactionReference;", "isFromCryptoSource", "", "fromDeepLink", "Stub", "lib-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface LegacyHistoryDetailResolver {

    /* renamed from: Stub, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    FragmentKey resolve(TransactionReference transactionReference, boolean isFromCryptoSource, boolean fromDeepLink);

    /* compiled from: LegacyHistoryDetailResolver.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ FragmentKey resolve$default(LegacyHistoryDetailResolver legacyHistoryDetailResolver, TransactionReference transactionReference, boolean z, boolean z2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolve");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            return legacyHistoryDetailResolver.resolve(transactionReference, z, z2);
        }
    }

    /* compiled from: LegacyHistoryDetailResolver.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/history/navigation/LegacyHistoryDetailResolver$Stub;", "Lcom/robinhood/shared/history/navigation/LegacyHistoryDetailResolver;", "<init>", "()V", SLRemoteConfiguration.Constants.RESOLVE_JSON_KEY, "Lcom/robinhood/android/navigation/keys/FragmentKey;", "transactionReference", "Lcom/robinhood/shared/models/history/shared/TransactionReference;", "isFromCryptoSource", "", "fromDeepLink", "lib-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.history.navigation.LegacyHistoryDetailResolver$Stub, reason: from kotlin metadata */
    public static final class Companion implements LegacyHistoryDetailResolver {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @Override // com.robinhood.shared.history.navigation.LegacyHistoryDetailResolver
        public FragmentKey resolve(TransactionReference transactionReference, boolean isFromCryptoSource, boolean fromDeepLink) {
            Intrinsics.checkNotNullParameter(transactionReference, "transactionReference");
            return null;
        }

        private Companion() {
        }
    }
}
