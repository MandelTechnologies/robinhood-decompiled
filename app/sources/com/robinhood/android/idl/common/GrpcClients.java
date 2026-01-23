package com.robinhood.android.idl.common;

import com.squareup.wire.GrpcClient;
import dagger.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* compiled from: GrpcClients.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a\u0018\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u001a\u0010\u0010\u000b\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\n0\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r"}, m3636d2 = {"GrpcClient", "Lcom/squareup/wire/GrpcClient;", "buildBlock", "Lkotlin/Function1;", "Lcom/squareup/wire/GrpcClient$Builder;", "", "Lkotlin/ExtensionFunctionType;", "client", "lazyClient", "Ldagger/Lazy;", "Lokhttp3/OkHttpClient;", "asCallFactory", "Lokhttp3/Call$Factory;", "lib-common_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.idl.common.GrpcClientsKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GrpcClients {
    public static final GrpcClient GrpcClient(Function1<? super GrpcClient.Builder, Unit> buildBlock) {
        Intrinsics.checkNotNullParameter(buildBlock, "buildBlock");
        GrpcClient.Builder builder = new GrpcClient.Builder();
        buildBlock.invoke(builder);
        return builder.build();
    }

    public static final GrpcClient.Builder client(GrpcClient.Builder builder, Lazy<OkHttpClient> lazyClient) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(lazyClient, "lazyClient");
        return builder.callFactory(asCallFactory(lazyClient));
    }

    public static final Call.Factory asCallFactory(final Lazy<OkHttpClient> lazy) {
        Intrinsics.checkNotNullParameter(lazy, "<this>");
        return new Call.Factory() { // from class: com.robinhood.android.idl.common.GrpcClientsKt.asCallFactory.1
            @Override // okhttp3.Call.Factory
            public final Call newCall(Request it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return lazy.get().newCall(it);
            }
        };
    }
}
