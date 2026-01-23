package com.robinhood.android.diagnostics.event;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.diagnostics.file.LogFileManager;
import com.robinhood.android.diagnostics.p100io.ProtoStreamWriting3;
import com.robinhood.models.card.p311db.Card;
import com.squareup.wire.ProtoAdapter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import p479j$.time.Clock;

/* compiled from: DiagnosticEventModule_ProvideDiagnosticEventWriterFactory.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B<\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0017\u0010\t\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R%\u0010\t\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/diagnostics/event/DiagnosticEventModule_ProvideDiagnosticEventWriterFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/android/diagnostics/io/ProtoStreamWriterForDiagnosticEventBatch;", "Ljavax/inject/Provider;", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/squareup/wire/ProtoAdapter;", "Lokio/ByteString;", "Lkotlin/jvm/JvmSuppressWildcards;", "bytesAdapter", "Lcom/robinhood/android/diagnostics/file/LogFileManager;", "logFileManager", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V", "get", "()Lcom/robinhood/android/diagnostics/io/ProtoStreamWriterForDiagnosticEventBatch;", "Ljavax/inject/Provider;", "Companion", "lib-diagnostics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class DiagnosticEventModule_ProvideDiagnosticEventWriterFactory implements Factory<ProtoStreamWriting3> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Provider<ProtoAdapter<ByteString>> bytesAdapter;
    private final Provider<Clock> clock;
    private final Provider<LogFileManager> logFileManager;

    @JvmStatic
    public static final DiagnosticEventModule_ProvideDiagnosticEventWriterFactory create(Provider<Clock> provider, Provider<ProtoAdapter<ByteString>> provider2, Provider<LogFileManager> provider3) {
        return INSTANCE.create(provider, provider2, provider3);
    }

    @JvmStatic
    public static final ProtoStreamWriting3 provideDiagnosticEventWriter(Clock clock, ProtoAdapter<ByteString> protoAdapter, LogFileManager logFileManager) {
        return INSTANCE.provideDiagnosticEventWriter(clock, protoAdapter, logFileManager);
    }

    public DiagnosticEventModule_ProvideDiagnosticEventWriterFactory(Provider<Clock> clock, Provider<ProtoAdapter<ByteString>> bytesAdapter, Provider<LogFileManager> logFileManager) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(bytesAdapter, "bytesAdapter");
        Intrinsics.checkNotNullParameter(logFileManager, "logFileManager");
        this.clock = clock;
        this.bytesAdapter = bytesAdapter;
        this.logFileManager = logFileManager;
    }

    @Override // javax.inject.Provider
    public ProtoStreamWriting3 get() {
        Companion companion = INSTANCE;
        Clock clock = this.clock.get();
        Intrinsics.checkNotNullExpressionValue(clock, "get(...)");
        ProtoAdapter<ByteString> protoAdapter = this.bytesAdapter.get();
        Intrinsics.checkNotNullExpressionValue(protoAdapter, "get(...)");
        LogFileManager logFileManager = this.logFileManager.get();
        Intrinsics.checkNotNullExpressionValue(logFileManager, "get(...)");
        return companion.provideDiagnosticEventWriter(clock, protoAdapter, logFileManager);
    }

    /* compiled from: DiagnosticEventModule_ProvideDiagnosticEventWriterFactory.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JD\u0010\u000e\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0017\u0010\n\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\t0\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/diagnostics/event/DiagnosticEventModule_ProvideDiagnosticEventWriterFactory$Companion;", "", "<init>", "()V", "Ljavax/inject/Provider;", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/squareup/wire/ProtoAdapter;", "Lokio/ByteString;", "Lkotlin/jvm/JvmSuppressWildcards;", "bytesAdapter", "Lcom/robinhood/android/diagnostics/file/LogFileManager;", "logFileManager", "Lcom/robinhood/android/diagnostics/event/DiagnosticEventModule_ProvideDiagnosticEventWriterFactory;", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/robinhood/android/diagnostics/event/DiagnosticEventModule_ProvideDiagnosticEventWriterFactory;", "Lcom/robinhood/android/diagnostics/io/ProtoStreamWriterForDiagnosticEventBatch;", "provideDiagnosticEventWriter", "(Lj$/time/Clock;Lcom/squareup/wire/ProtoAdapter;Lcom/robinhood/android/diagnostics/file/LogFileManager;)Lcom/robinhood/android/diagnostics/io/ProtoStreamWriterForDiagnosticEventBatch;", "lib-diagnostics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final DiagnosticEventModule_ProvideDiagnosticEventWriterFactory create(Provider<Clock> clock, Provider<ProtoAdapter<ByteString>> bytesAdapter, Provider<LogFileManager> logFileManager) {
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(bytesAdapter, "bytesAdapter");
            Intrinsics.checkNotNullParameter(logFileManager, "logFileManager");
            return new DiagnosticEventModule_ProvideDiagnosticEventWriterFactory(clock, bytesAdapter, logFileManager);
        }

        @JvmStatic
        public final ProtoStreamWriting3 provideDiagnosticEventWriter(Clock clock, ProtoAdapter<ByteString> bytesAdapter, LogFileManager logFileManager) {
            Intrinsics.checkNotNullParameter(clock, "clock");
            Intrinsics.checkNotNullParameter(bytesAdapter, "bytesAdapter");
            Intrinsics.checkNotNullParameter(logFileManager, "logFileManager");
            Object objCheckNotNull = Preconditions.checkNotNull(DiagnosticEventModule.INSTANCE.provideDiagnosticEventWriter(clock, bytesAdapter, logFileManager), "Cannot return null from a non-@Nullable @Provides method");
            Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
            return (ProtoStreamWriting3) objCheckNotNull;
        }
    }
}
