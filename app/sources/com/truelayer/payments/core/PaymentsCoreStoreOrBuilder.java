package com.truelayer.payments.core;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.truelayer.payments.core.PaymentsCoreStore;
import java.util.Map;

/* loaded from: classes6.dex */
public interface PaymentsCoreStoreOrBuilder extends MessageLiteOrBuilder {
    boolean containsAdditionalInputs(String str);

    boolean containsProviders(String str);

    @Deprecated
    Map<String, PaymentsCoreStore.RecentAdditionalInputPerProvider> getAdditionalInputs();

    int getAdditionalInputsCount();

    Map<String, PaymentsCoreStore.RecentAdditionalInputPerProvider> getAdditionalInputsMap();

    PaymentsCoreStore.RecentAdditionalInputPerProvider getAdditionalInputsOrDefault(String str, PaymentsCoreStore.RecentAdditionalInputPerProvider recentAdditionalInputPerProvider);

    PaymentsCoreStore.RecentAdditionalInputPerProvider getAdditionalInputsOrThrow(String str);

    String getLastUsedCountryCode();

    ByteString getLastUsedCountryCodeBytes();

    @Deprecated
    Map<String, PaymentsCoreStore.RecentSingleImmediateProvider> getProviders();

    int getProvidersCount();

    Map<String, PaymentsCoreStore.RecentSingleImmediateProvider> getProvidersMap();

    PaymentsCoreStore.RecentSingleImmediateProvider getProvidersOrDefault(String str, PaymentsCoreStore.RecentSingleImmediateProvider recentSingleImmediateProvider);

    PaymentsCoreStore.RecentSingleImmediateProvider getProvidersOrThrow(String str);
}
