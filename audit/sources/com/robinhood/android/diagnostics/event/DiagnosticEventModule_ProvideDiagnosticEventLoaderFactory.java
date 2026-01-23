package com.robinhood.android.diagnostics.event;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.squareup.wire.ProtoAdapter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* compiled from: DiagnosticEventModule_ProvideDiagnosticEventLoaderFactory.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB \u0012\u0017\u0010\u0003\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u00070\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u001f\u0010\u0003\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\b\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/diagnostics/event/DiagnosticEventModule_ProvideDiagnosticEventLoaderFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/diagnostics/event/DiagnosticEventLoader;", "bytesAdapter", "Ljavax/inject/Provider;", "Lcom/squareup/wire/ProtoAdapter;", "Lokio/ByteString;", "Lkotlin/jvm/JvmSuppressWildcards;", "<init>", "(Ljavax/inject/Provider;)V", "get", "Companion", "lib-diagnostics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class DiagnosticEventModule_ProvideDiagnosticEventLoaderFactory implements Factory<DiagnosticEventLoader> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<ProtoAdapter<ByteString>> bytesAdapter;

    @JvmStatic
    public static final DiagnosticEventModule_ProvideDiagnosticEventLoaderFactory create(Provider<ProtoAdapter<ByteString>> provider) {
        return INSTANCE.create(provider);
    }

    @JvmStatic
    public static final DiagnosticEventLoader provideDiagnosticEventLoader(ProtoAdapter<ByteString> protoAdapter) {
        return INSTANCE.provideDiagnosticEventLoader(protoAdapter);
    }

    public DiagnosticEventModule_ProvideDiagnosticEventLoaderFactory(Provider<ProtoAdapter<ByteString>> bytesAdapter) {
        Intrinsics.checkNotNullParameter(bytesAdapter, "bytesAdapter");
        this.bytesAdapter = bytesAdapter;
    }

    @Override // javax.inject.Provider
    public DiagnosticEventLoader get() {
        Companion companion = INSTANCE;
        ProtoAdapter<ByteString> protoAdapter = this.bytesAdapter.get();
        Intrinsics.checkNotNullExpressionValue(protoAdapter, "get(...)");
        return companion.provideDiagnosticEventLoader(protoAdapter);
    }

    /* compiled from: DiagnosticEventModule_ProvideDiagnosticEventLoaderFactory.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n0\u0007H\u0007J\u001b\u0010\u000b\u001a\u00020\f2\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/diagnostics/event/DiagnosticEventModule_ProvideDiagnosticEventLoaderFactory$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/robinhood/android/diagnostics/event/DiagnosticEventModule_ProvideDiagnosticEventLoaderFactory;", "bytesAdapter", "Ljavax/inject/Provider;", "Lcom/squareup/wire/ProtoAdapter;", "Lokio/ByteString;", "Lkotlin/jvm/JvmSuppressWildcards;", "provideDiagnosticEventLoader", "Lcom/robinhood/android/diagnostics/event/DiagnosticEventLoader;", "lib-diagnostics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final DiagnosticEventModule_ProvideDiagnosticEventLoaderFactory create(Provider<ProtoAdapter<ByteString>> bytesAdapter) {
            Intrinsics.checkNotNullParameter(bytesAdapter, "bytesAdapter");
            return new DiagnosticEventModule_ProvideDiagnosticEventLoaderFactory(bytesAdapter);
        }

        @JvmStatic
        public final DiagnosticEventLoader provideDiagnosticEventLoader(ProtoAdapter<ByteString> bytesAdapter) {
            Intrinsics.checkNotNullParameter(bytesAdapter, "bytesAdapter");
            Object objCheckNotNull = Preconditions.checkNotNull(DiagnosticEventModule.INSTANCE.provideDiagnosticEventLoader(bytesAdapter), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (DiagnosticEventLoader) objCheckNotNull;
        }
    }
}
