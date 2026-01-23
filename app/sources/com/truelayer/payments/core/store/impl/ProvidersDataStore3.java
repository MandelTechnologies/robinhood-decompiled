package com.truelayer.payments.core.store.impl;

import android.content.Context;
import androidx.datastore.DataStoreDelegate;
import androidx.datastore.core.DataMigration;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.Serializer2;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import com.truelayer.payments.core.PaymentsCoreStore;
import com.truelayer.payments.core.domain.payments.RecentAdditionalInput;
import com.truelayer.payments.core.domain.payments.RecentProvider;
import com.truelayer.payments.core.domain.utils.Fail;
import com.truelayer.payments.core.domain.utils.Ok;
import com.truelayer.payments.core.domain.utils.Outcome;
import com.truelayer.payments.core.store.entity.PaymentsCoreStoreSerializer;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: ProvidersDataStore.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t*\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0002\u001a\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t*\u00060\u000fj\u0002`\u0010\u001a\u000e\u0010\u0011\u001a\u00020\u0012*\u00060\u0013j\u0002`\u0014\u001a\u000e\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014*\u00020\u0012\u001a\u000e\u0010\u0016\u001a\u00060\u000fj\u0002`\u0010*\u00020\n\u001a \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000b0\t*\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001aH\u0002\"%\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\u0005*\f\b\u0002\u0010\u001b\"\u00020\u00132\u00020\u0013*\f\b\u0002\u0010\u001c\"\u00020\u000f2\u00020\u000f¨\u0006\u001d"}, m3636d2 = {"dataStore", "Landroidx/datastore/core/DataStore;", "Lcom/truelayer/payments/core/PaymentsCoreStore;", "Landroid/content/Context;", "getDataStore", "(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", "dataStore$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getProvider", "Lcom/truelayer/payments/core/domain/utils/Outcome;", "Lcom/truelayer/payments/core/domain/payments/RecentProvider;", "", "id", "", "intoDomainProvider", "Lcom/truelayer/payments/core/PaymentsCoreStore$RecentSingleImmediateProvider;", "Lcom/truelayer/payments/core/store/impl/RecentSingleImmediateProvider;", "intoDomainRecentAdditionalInput", "Lcom/truelayer/payments/core/domain/payments/RecentAdditionalInput;", "Lcom/truelayer/payments/core/PaymentsCoreStore$RecentAdditionalInput;", "Lcom/truelayer/payments/core/store/impl/RecentAdditionalInputStore;", "intoRecentAdditionalInput", "intoRecentProvider", "removeExcessProviders", "", "maxRecordLimit", "", "RecentAdditionalInputStore", "RecentSingleImmediateProvider", "payments-core_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.core.store.impl.ProvidersDataStoreKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class ProvidersDataStore3 {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ProvidersDataStore3.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};
    private static final Interfaces2 dataStore$delegate = DataStoreDelegate.dataStore$default("tl_sdk_store.pb", PaymentsCoreStoreSerializer.INSTANCE, new ReplaceFileCorruptionHandler(new Function1<Serializer2, PaymentsCoreStore>() { // from class: com.truelayer.payments.core.store.impl.ProvidersDataStoreKt$dataStore$2
        @Override // kotlin.jvm.functions.Function1
        public final PaymentsCoreStore invoke(Serializer2 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            PaymentsCoreStore defaultInstance = PaymentsCoreStore.getDefaultInstance();
            Intrinsics.checkNotNullExpressionValue(defaultInstance, "getDefaultInstance(...)");
            return defaultInstance;
        }
    }), new Function1<Context, List<? extends DataMigration<PaymentsCoreStore>>>() { // from class: com.truelayer.payments.core.store.impl.ProvidersDataStoreKt$dataStore$3
        @Override // kotlin.jvm.functions.Function1
        public final List<DataMigration<PaymentsCoreStore>> invoke(Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return CollectionsKt.emptyList();
        }
    }, null, 16, null);

    public static final DataStore<PaymentsCoreStore> getDataStore(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (DataStore) dataStore$delegate.getValue(context, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Outcome<RecentProvider, Throwable> getProvider(PaymentsCoreStore paymentsCoreStore, String str) {
        try {
            PaymentsCoreStore.RecentSingleImmediateProvider recentSingleImmediateProvider = paymentsCoreStore.getProvidersMap().get(str);
            if (recentSingleImmediateProvider == null) {
                throw new IllegalStateException("Failed to retrieve recent provider: " + str);
            }
            return new Ok((RecentProvider) Outcome.expect$default(intoDomainProvider(recentSingleImmediateProvider), null, 1, null));
        } catch (Throwable th) {
            return new Fail(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Outcome<Unit, Throwable> removeExcessProviders(PaymentsCoreStore paymentsCoreStore, int i) {
        int i2 = i - 1;
        try {
            if (paymentsCoreStore.getProvidersCount() >= i2) {
                PaymentsCoreStore.Builder builder = paymentsCoreStore.toBuilder();
                Iterator it = CollectionsKt.takeLast(CollectionsKt.sortedWith(paymentsCoreStore.getProvidersMap().values(), new Comparator() { // from class: com.truelayer.payments.core.store.impl.ProvidersDataStoreKt$removeExcessProviders$lambda$3$$inlined$sortedByDescending$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(Long.valueOf(((PaymentsCoreStore.RecentSingleImmediateProvider) t2).getLastUsedDate()), Long.valueOf(((PaymentsCoreStore.RecentSingleImmediateProvider) t).getLastUsedDate()));
                    }
                }), paymentsCoreStore.getProvidersCount() - i2).iterator();
                while (it.hasNext()) {
                    builder.removeProviders(((PaymentsCoreStore.RecentSingleImmediateProvider) it.next()).getProviderId());
                }
            }
            return new Ok(Unit.INSTANCE);
        } catch (Throwable th) {
            return new Fail(th);
        }
    }

    public static final PaymentsCoreStore.RecentSingleImmediateProvider intoRecentProvider(RecentProvider recentProvider) {
        Intrinsics.checkNotNullParameter(recentProvider, "<this>");
        PaymentsCoreStore.RecentSingleImmediateProvider recentSingleImmediateProviderBuild = PaymentsCoreStore.RecentSingleImmediateProvider.newBuilder().setProviderId(recentProvider.getId()).setLastUsedDate(System.currentTimeMillis()).build();
        Intrinsics.checkNotNullExpressionValue(recentSingleImmediateProviderBuild, "build(...)");
        return recentSingleImmediateProviderBuild;
    }

    public static final Outcome<RecentProvider, Throwable> intoDomainProvider(PaymentsCoreStore.RecentSingleImmediateProvider recentSingleImmediateProvider) {
        Intrinsics.checkNotNullParameter(recentSingleImmediateProvider, "<this>");
        try {
            String providerId = recentSingleImmediateProvider.getProviderId();
            Intrinsics.checkNotNullExpressionValue(providerId, "getProviderId(...)");
            return new Ok(new RecentProvider(providerId, new Date(recentSingleImmediateProvider.getLastUsedDate())));
        } catch (Throwable th) {
            return new Fail(th);
        }
    }

    public static final PaymentsCoreStore.RecentAdditionalInput intoRecentAdditionalInput(RecentAdditionalInput recentAdditionalInput) {
        Intrinsics.checkNotNullParameter(recentAdditionalInput, "<this>");
        PaymentsCoreStore.RecentAdditionalInput recentAdditionalInputBuild = PaymentsCoreStore.RecentAdditionalInput.newBuilder().setInputId(recentAdditionalInput.getInputId()).setValue(recentAdditionalInput.getValue()).setLastUsedDate(recentAdditionalInput.getLastUsedDate().getTime()).build();
        Intrinsics.checkNotNullExpressionValue(recentAdditionalInputBuild, "build(...)");
        return recentAdditionalInputBuild;
    }

    public static final RecentAdditionalInput intoDomainRecentAdditionalInput(PaymentsCoreStore.RecentAdditionalInput recentAdditionalInput) {
        Intrinsics.checkNotNullParameter(recentAdditionalInput, "<this>");
        String inputId = recentAdditionalInput.getInputId();
        Intrinsics.checkNotNullExpressionValue(inputId, "getInputId(...)");
        String value = recentAdditionalInput.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return new RecentAdditionalInput(inputId, value, new Date(recentAdditionalInput.getLastUsedDate()));
    }
}
