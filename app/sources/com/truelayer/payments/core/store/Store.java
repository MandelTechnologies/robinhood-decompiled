package com.truelayer.payments.core.store;

import android.content.Context;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.truelayer.payments.core.store.impl.StoreDataStore;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Store.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m3636d2 = {"Lcom/truelayer/payments/core/store/Store;", "", "additionalInputs", "Lcom/truelayer/payments/core/store/AdditionalInputs;", "getAdditionalInputs", "()Lcom/truelayer/payments/core/store/AdditionalInputs;", PlaceTypes.COUNTRY, "Lcom/truelayer/payments/core/store/CountryStore;", "getCountry", "()Lcom/truelayer/payments/core/store/CountryStore;", "maxRecordLimit", "", "getMaxRecordLimit", "()I", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface Store {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    AdditionalInputs getAdditionalInputs();

    CountryStore getCountry();

    int getMaxRecordLimit();

    /* compiled from: Store.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/truelayer/payments/core/store/Store$Companion;", "", "()V", "shared", "Lcom/truelayer/payments/core/store/Store;", "context", "Landroid/content/Context;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final Store shared(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            StoreDataStore.Companion companion = StoreDataStore.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            return companion.shared(applicationContext);
        }
    }
}
