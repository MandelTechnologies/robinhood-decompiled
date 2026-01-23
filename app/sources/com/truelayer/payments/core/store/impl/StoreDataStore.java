package com.truelayer.payments.core.store.impl;

import android.content.Context;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.truelayer.payments.core.store.AdditionalInputs;
import com.truelayer.payments.core.store.CountryStore;
import com.truelayer.payments.core.store.Store;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StoreDataStore.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m3636d2 = {"Lcom/truelayer/payments/core/store/impl/StoreDataStore;", "Lcom/truelayer/payments/core/store/Store;", "applicationContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "additionalInputs", "Lcom/truelayer/payments/core/store/AdditionalInputs;", "getAdditionalInputs", "()Lcom/truelayer/payments/core/store/AdditionalInputs;", PlaceTypes.COUNTRY, "Lcom/truelayer/payments/core/store/CountryStore;", "getCountry", "()Lcom/truelayer/payments/core/store/CountryStore;", "maxRecordLimit", "", "getMaxRecordLimit", "()I", "Companion", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class StoreDataStore implements Store {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static volatile StoreDataStore store;
    private final AdditionalInputs additionalInputs;
    private final CountryStore country;
    private final int maxRecordLimit;

    public /* synthetic */ StoreDataStore(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    private StoreDataStore(Context context) {
        this.maxRecordLimit = 15;
        this.country = new CountryDataStore(context);
        this.additionalInputs = new AdditionalInputsDataStore(context);
    }

    /* compiled from: StoreDataStore.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/truelayer/payments/core/store/impl/StoreDataStore$Companion;", "", "()V", PlaceTypes.STORE, "Lcom/truelayer/payments/core/store/impl/StoreDataStore;", "shared", "context", "Landroid/content/Context;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final StoreDataStore shared(Context context) {
            StoreDataStore storeDataStore;
            Intrinsics.checkNotNullParameter(context, "context");
            StoreDataStore storeDataStore2 = StoreDataStore.store;
            if (storeDataStore2 != null) {
                return storeDataStore2;
            }
            synchronized (this) {
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                StoreDataStore.store = new StoreDataStore(applicationContext, null);
                storeDataStore = StoreDataStore.store;
                Intrinsics.checkNotNull(storeDataStore);
            }
            return storeDataStore;
        }
    }

    @Override // com.truelayer.payments.core.store.Store
    public int getMaxRecordLimit() {
        return this.maxRecordLimit;
    }

    @Override // com.truelayer.payments.core.store.Store
    public CountryStore getCountry() {
        return this.country;
    }

    @Override // com.truelayer.payments.core.store.Store
    public AdditionalInputs getAdditionalInputs() {
        return this.additionalInputs;
    }
}
