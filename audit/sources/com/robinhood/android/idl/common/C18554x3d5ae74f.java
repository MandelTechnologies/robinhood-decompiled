package com.robinhood.android.idl.common;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.idl.common.IdlMultibindingModule;
import com.robinhood.idl.Dto;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.Map;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IdlMultibindingModule_SupplierMapModule_ProvideDtoCreatorSupplierMapFactory.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u00172+\u0012'\u0012%\u0012\u0004\u0012\u00020\u0003\u0012\u0017\u0012\u0015\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0002\b\u00060\u0002j\u0002`\u00070\u0001:\u0001\u0017Bå\u0002\u0012!\u0010\b\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\n¢\u0006\u0002\b\u00060\t\u0012!\u0010\u000b\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\n¢\u0006\u0002\b\u00060\t\u0012!\u0010\f\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\n¢\u0006\u0002\b\u00060\t\u0012!\u0010\r\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\n¢\u0006\u0002\b\u00060\t\u0012!\u0010\u000e\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\n¢\u0006\u0002\b\u00060\t\u0012!\u0010\u000f\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\n¢\u0006\u0002\b\u00060\t\u0012!\u0010\u0010\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\n¢\u0006\u0002\b\u00060\t\u0012!\u0010\u0011\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\n¢\u0006\u0002\b\u00060\t\u0012!\u0010\u0012\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\n¢\u0006\u0002\b\u00060\t\u0012!\u0010\u0013\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\n¢\u0006\u0002\b\u00060\t¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0016\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0017\u0012\u0015\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0002\b\u00060\u0002j\u0002`\u0007H\u0016R)\u0010\b\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\n¢\u0006\u0002\b\u00060\tX\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u000b\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\n¢\u0006\u0002\b\u00060\tX\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\f\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\n¢\u0006\u0002\b\u00060\tX\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\r\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\n¢\u0006\u0002\b\u00060\tX\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u000e\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\n¢\u0006\u0002\b\u00060\tX\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u000f\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\n¢\u0006\u0002\b\u00060\tX\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u0010\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\n¢\u0006\u0002\b\u00060\tX\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u0011\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\n¢\u0006\u0002\b\u00060\tX\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u0012\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\n¢\u0006\u0002\b\u00060\tX\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u0013\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\n¢\u0006\u0002\b\u00060\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/idl/common/IdlMultibindingModule_SupplierMapModule_ProvideDtoCreatorSupplierMapFactory;", "Ldagger/internal/Factory;", "", "", "Lkotlin/Function0;", "Lcom/robinhood/idl/Dto$SerializableCreator;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/robinhood/idl/DtoCreatorSupplierMap;", "shard0", "Ljavax/inject/Provider;", "Lcom/robinhood/android/idl/common/DtoClassNames;", "shard1", "shard2", "shard3", "shard4", "shard5", "shard6", "shard7", "shard8", "shard9", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "Companion", "lib-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.idl.common.IdlMultibindingModule_SupplierMapModule_ProvideDtoCreatorSupplierMapFactory */
/* loaded from: classes10.dex */
public final class C18554x3d5ae74f implements Factory<Map<String, Function0<Dto.SerializableCreator<?, ?>>>> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<Map<String, String>> shard0;
    private final Provider<Map<String, String>> shard1;
    private final Provider<Map<String, String>> shard2;
    private final Provider<Map<String, String>> shard3;
    private final Provider<Map<String, String>> shard4;
    private final Provider<Map<String, String>> shard5;
    private final Provider<Map<String, String>> shard6;
    private final Provider<Map<String, String>> shard7;
    private final Provider<Map<String, String>> shard8;
    private final Provider<Map<String, String>> shard9;

    @JvmStatic
    public static final C18554x3d5ae74f create(Provider<Map<String, String>> provider, Provider<Map<String, String>> provider2, Provider<Map<String, String>> provider3, Provider<Map<String, String>> provider4, Provider<Map<String, String>> provider5, Provider<Map<String, String>> provider6, Provider<Map<String, String>> provider7, Provider<Map<String, String>> provider8, Provider<Map<String, String>> provider9, Provider<Map<String, String>> provider10) {
        return INSTANCE.create(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    @JvmStatic
    public static final Map<String, Function0<Dto.SerializableCreator<?, ?>>> provideDtoCreatorSupplierMap(Map<String, String> map, Map<String, String> map2, Map<String, String> map3, Map<String, String> map4, Map<String, String> map5, Map<String, String> map6, Map<String, String> map7, Map<String, String> map8, Map<String, String> map9, Map<String, String> map10) {
        return INSTANCE.provideDtoCreatorSupplierMap(map, map2, map3, map4, map5, map6, map7, map8, map9, map10);
    }

    public C18554x3d5ae74f(Provider<Map<String, String>> shard0, Provider<Map<String, String>> shard1, Provider<Map<String, String>> shard2, Provider<Map<String, String>> shard3, Provider<Map<String, String>> shard4, Provider<Map<String, String>> shard5, Provider<Map<String, String>> shard6, Provider<Map<String, String>> shard7, Provider<Map<String, String>> shard8, Provider<Map<String, String>> shard9) {
        Intrinsics.checkNotNullParameter(shard0, "shard0");
        Intrinsics.checkNotNullParameter(shard1, "shard1");
        Intrinsics.checkNotNullParameter(shard2, "shard2");
        Intrinsics.checkNotNullParameter(shard3, "shard3");
        Intrinsics.checkNotNullParameter(shard4, "shard4");
        Intrinsics.checkNotNullParameter(shard5, "shard5");
        Intrinsics.checkNotNullParameter(shard6, "shard6");
        Intrinsics.checkNotNullParameter(shard7, "shard7");
        Intrinsics.checkNotNullParameter(shard8, "shard8");
        Intrinsics.checkNotNullParameter(shard9, "shard9");
        this.shard0 = shard0;
        this.shard1 = shard1;
        this.shard2 = shard2;
        this.shard3 = shard3;
        this.shard4 = shard4;
        this.shard5 = shard5;
        this.shard6 = shard6;
        this.shard7 = shard7;
        this.shard8 = shard8;
        this.shard9 = shard9;
    }

    @Override // javax.inject.Provider
    public Map<String, Function0<Dto.SerializableCreator<?, ?>>> get() {
        Companion companion = INSTANCE;
        Map<String, String> map = this.shard0.get();
        Intrinsics.checkNotNullExpressionValue(map, "get(...)");
        Map<String, String> map2 = this.shard1.get();
        Intrinsics.checkNotNullExpressionValue(map2, "get(...)");
        Map<String, String> map3 = this.shard2.get();
        Intrinsics.checkNotNullExpressionValue(map3, "get(...)");
        Map<String, String> map4 = this.shard3.get();
        Intrinsics.checkNotNullExpressionValue(map4, "get(...)");
        Map<String, String> map5 = this.shard4.get();
        Intrinsics.checkNotNullExpressionValue(map5, "get(...)");
        Map<String, String> map6 = this.shard5.get();
        Intrinsics.checkNotNullExpressionValue(map6, "get(...)");
        Map<String, String> map7 = this.shard6.get();
        Intrinsics.checkNotNullExpressionValue(map7, "get(...)");
        Map<String, String> map8 = this.shard7.get();
        Intrinsics.checkNotNullExpressionValue(map8, "get(...)");
        Map<String, String> map9 = this.shard8.get();
        Intrinsics.checkNotNullExpressionValue(map9, "get(...)");
        Map<String, String> map10 = this.shard9.get();
        Intrinsics.checkNotNullExpressionValue(map10, "get(...)");
        return companion.provideDtoCreatorSupplierMap(map, map2, map3, map4, map5, map6, map7, map8, map9, map10);
    }

    /* compiled from: IdlMultibindingModule_SupplierMapModule_ProvideDtoCreatorSupplierMapFactory.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jæ\u0002\u0010\u0004\u001a\u00020\u00052!\u0010\u0006\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bj\u0002`\u000b¢\u0006\u0002\b\n0\u00072!\u0010\f\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bj\u0002`\u000b¢\u0006\u0002\b\n0\u00072!\u0010\r\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bj\u0002`\u000b¢\u0006\u0002\b\n0\u00072!\u0010\u000e\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bj\u0002`\u000b¢\u0006\u0002\b\n0\u00072!\u0010\u000f\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bj\u0002`\u000b¢\u0006\u0002\b\n0\u00072!\u0010\u0010\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bj\u0002`\u000b¢\u0006\u0002\b\n0\u00072!\u0010\u0011\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bj\u0002`\u000b¢\u0006\u0002\b\n0\u00072!\u0010\u0012\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bj\u0002`\u000b¢\u0006\u0002\b\n0\u00072!\u0010\u0013\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bj\u0002`\u000b¢\u0006\u0002\b\n0\u00072!\u0010\u0014\u001a\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bj\u0002`\u000b¢\u0006\u0002\b\n0\u0007H\u0007JÍ\u0002\u0010\u0015\u001a%\u0012\u0004\u0012\u00020\t\u0012\u0017\u0012\u0015\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00170\u0016¢\u0006\u0002\b\n0\bj\u0002`\u00182\u001b\u0010\u0006\u001a\u0017\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bj\u0002`\u000b¢\u0006\u0002\b\n2\u001b\u0010\f\u001a\u0017\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bj\u0002`\u000b¢\u0006\u0002\b\n2\u001b\u0010\r\u001a\u0017\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bj\u0002`\u000b¢\u0006\u0002\b\n2\u001b\u0010\u000e\u001a\u0017\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bj\u0002`\u000b¢\u0006\u0002\b\n2\u001b\u0010\u000f\u001a\u0017\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bj\u0002`\u000b¢\u0006\u0002\b\n2\u001b\u0010\u0010\u001a\u0017\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bj\u0002`\u000b¢\u0006\u0002\b\n2\u001b\u0010\u0011\u001a\u0017\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bj\u0002`\u000b¢\u0006\u0002\b\n2\u001b\u0010\u0012\u001a\u0017\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bj\u0002`\u000b¢\u0006\u0002\b\n2\u001b\u0010\u0013\u001a\u0017\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bj\u0002`\u000b¢\u0006\u0002\b\n2\u001b\u0010\u0014\u001a\u0017\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bj\u0002`\u000b¢\u0006\u0002\b\nH\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/idl/common/IdlMultibindingModule_SupplierMapModule_ProvideDtoCreatorSupplierMapFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/idl/common/IdlMultibindingModule_SupplierMapModule_ProvideDtoCreatorSupplierMapFactory;", "shard0", "Ljavax/inject/Provider;", "", "", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/robinhood/android/idl/common/DtoClassNames;", "shard1", "shard2", "shard3", "shard4", "shard5", "shard6", "shard7", "shard8", "shard9", "provideDtoCreatorSupplierMap", "Lkotlin/Function0;", "Lcom/robinhood/idl/Dto$SerializableCreator;", "Lcom/robinhood/idl/DtoCreatorSupplierMap;", "lib-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.idl.common.IdlMultibindingModule_SupplierMapModule_ProvideDtoCreatorSupplierMapFactory$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final C18554x3d5ae74f create(Provider<Map<String, String>> shard0, Provider<Map<String, String>> shard1, Provider<Map<String, String>> shard2, Provider<Map<String, String>> shard3, Provider<Map<String, String>> shard4, Provider<Map<String, String>> shard5, Provider<Map<String, String>> shard6, Provider<Map<String, String>> shard7, Provider<Map<String, String>> shard8, Provider<Map<String, String>> shard9) {
            Intrinsics.checkNotNullParameter(shard0, "shard0");
            Intrinsics.checkNotNullParameter(shard1, "shard1");
            Intrinsics.checkNotNullParameter(shard2, "shard2");
            Intrinsics.checkNotNullParameter(shard3, "shard3");
            Intrinsics.checkNotNullParameter(shard4, "shard4");
            Intrinsics.checkNotNullParameter(shard5, "shard5");
            Intrinsics.checkNotNullParameter(shard6, "shard6");
            Intrinsics.checkNotNullParameter(shard7, "shard7");
            Intrinsics.checkNotNullParameter(shard8, "shard8");
            Intrinsics.checkNotNullParameter(shard9, "shard9");
            return new C18554x3d5ae74f(shard0, shard1, shard2, shard3, shard4, shard5, shard6, shard7, shard8, shard9);
        }

        @JvmStatic
        public final Map<String, Function0<Dto.SerializableCreator<?, ?>>> provideDtoCreatorSupplierMap(Map<String, String> shard0, Map<String, String> shard1, Map<String, String> shard2, Map<String, String> shard3, Map<String, String> shard4, Map<String, String> shard5, Map<String, String> shard6, Map<String, String> shard7, Map<String, String> shard8, Map<String, String> shard9) {
            Intrinsics.checkNotNullParameter(shard0, "shard0");
            Intrinsics.checkNotNullParameter(shard1, "shard1");
            Intrinsics.checkNotNullParameter(shard2, "shard2");
            Intrinsics.checkNotNullParameter(shard3, "shard3");
            Intrinsics.checkNotNullParameter(shard4, "shard4");
            Intrinsics.checkNotNullParameter(shard5, "shard5");
            Intrinsics.checkNotNullParameter(shard6, "shard6");
            Intrinsics.checkNotNullParameter(shard7, "shard7");
            Intrinsics.checkNotNullParameter(shard8, "shard8");
            Intrinsics.checkNotNullParameter(shard9, "shard9");
            Object objCheckNotNull = Preconditions.checkNotNull(IdlMultibindingModule.SupplierMapModule.INSTANCE.provideDtoCreatorSupplierMap(shard0, shard1, shard2, shard3, shard4, shard5, shard6, shard7, shard8, shard9), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (Map) objCheckNotNull;
        }
    }
}
