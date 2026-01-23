package com.robinhood.android.diagnostics.file;

import androidx.lifecycle.viewmodel.internal.ViewModelImpl$$ExternalSyntheticAutoCloseableDispatcher0;
import com.robinhood.android.diagnostics.event.DiagnosticEventBatch;
import com.robinhood.android.diagnostics.p100io.ProtoStreamWriting2;
import com.robinhood.android.diagnostics.p100io.ProtoStreamWriting3;
import com.robinhood.android.diagnostics.p100io.ProtoStreamWriting4;
import com.robinhood.models.card.p311db.Card;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import okio.Okio;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: RotatingFileMessageStreamWriter.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001fB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/diagnostics/file/RotatingFileMessageStreamWriter;", "Lcom/robinhood/android/diagnostics/io/ProtoStreamWriterForDiagnosticEventBatch;", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/squareup/wire/ProtoAdapter;", "Lokio/ByteString;", "bytesAdapter", "Lcom/robinhood/android/diagnostics/file/LogFileManager;", "logFileManager", "<init>", "(Lj$/time/Clock;Lcom/squareup/wire/ProtoAdapter;Lcom/robinhood/android/diagnostics/file/LogFileManager;)V", "Lcom/robinhood/android/diagnostics/io/ProtoStreamWriter;", "Lcom/robinhood/android/diagnostics/event/DiagnosticEventBatch;", "obtainWriter", "()Lcom/robinhood/android/diagnostics/io/ProtoStreamWriter;", "value", "", "write", "(Lcom/robinhood/android/diagnostics/event/DiagnosticEventBatch;)V", "flush", "()V", "close", "Lj$/time/Clock;", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/android/diagnostics/file/LogFileManager;", "", "isClosed", "Z", "Lcom/robinhood/android/diagnostics/file/RotatingFileMessageStreamWriter$State;", "state", "Lcom/robinhood/android/diagnostics/file/RotatingFileMessageStreamWriter$State;", "State", "lib-diagnostics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class RotatingFileMessageStreamWriter implements ProtoStreamWriting3 {
    private final ProtoAdapter<ByteString> bytesAdapter;
    private final Clock clock;
    private volatile boolean isClosed;
    private final LogFileManager logFileManager;
    private volatile State<? super DiagnosticEventBatch> state;

    public RotatingFileMessageStreamWriter(Clock clock, ProtoAdapter<ByteString> bytesAdapter, LogFileManager logFileManager) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(bytesAdapter, "bytesAdapter");
        Intrinsics.checkNotNullParameter(logFileManager, "logFileManager");
        this.clock = clock;
        this.bytesAdapter = bytesAdapter;
        this.logFileManager = logFileManager;
    }

    @Override // com.robinhood.android.diagnostics.p100io.ProtoStreamWriting2
    public synchronized void write(DiagnosticEventBatch value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.isClosed) {
            throw new IllegalStateException("Check failed.");
        }
        obtainWriter().write(value);
    }

    @Override // com.robinhood.android.diagnostics.p100io.ProtoStreamWriting2
    public synchronized void flush() {
        ProtoStreamWriting2<E> writer;
        State<? super DiagnosticEventBatch> state = this.state;
        if (state != null && (writer = state.getWriter()) != 0) {
            writer.flush();
        }
    }

    @Override // java.lang.AutoCloseable
    public synchronized void close() {
        Object writer;
        try {
            this.isClosed = true;
            State<? super DiagnosticEventBatch> state = this.state;
            if (state != null && (writer = state.getWriter()) != null) {
                ViewModelImpl$$ExternalSyntheticAutoCloseableDispatcher0.m529m(writer);
            }
            this.state = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized ProtoStreamWriting2<DiagnosticEventBatch> obtainWriter() {
        Instant instant = this.clock.instant();
        LogFileManager logFileManager = this.logFileManager;
        Intrinsics.checkNotNull(instant);
        File logFileForTimestamp = logFileManager.getLogFileForTimestamp(instant);
        State<? super DiagnosticEventBatch> state = this.state;
        if (state != null) {
            if (Intrinsics.areEqual(state.getFile(), logFileForTimestamp)) {
                return state.getWriter();
            }
            ViewModelImpl$$ExternalSyntheticAutoCloseableDispatcher0.m529m(state.getWriter());
        }
        ProtoStreamWriting2<DiagnosticEventBatch> protoStreamWriting2MessageStreamWriter = ProtoStreamWriting4.messageStreamWriter(Okio.buffer(Okio.appendingSink(logFileForTimestamp)), this.bytesAdapter);
        this.state = new State<>(logFileForTimestamp, protoStreamWriting2MessageStreamWriter);
        return protoStreamWriting2MessageStreamWriter;
    }

    /* compiled from: RotatingFileMessageStreamWriter.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0012\b\u0000\u0010\u0001 \u0000*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u00020\u0003B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/diagnostics/file/RotatingFileMessageStreamWriter$State;", "E", "Lcom/squareup/wire/Message;", "", "file", "Ljava/io/File;", "writer", "Lcom/robinhood/android/diagnostics/io/ProtoStreamWriter;", "<init>", "(Ljava/io/File;Lcom/robinhood/android/diagnostics/io/ProtoStreamWriter;)V", "getFile", "()Ljava/io/File;", "getWriter", "()Lcom/robinhood/android/diagnostics/io/ProtoStreamWriter;", "lib-diagnostics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class State<E extends Message<?, ?>> {
        private final File file;
        private final ProtoStreamWriting2<E> writer;

        /* JADX WARN: Multi-variable type inference failed */
        public State(File file, ProtoStreamWriting2<? super E> writer) {
            Intrinsics.checkNotNullParameter(file, "file");
            Intrinsics.checkNotNullParameter(writer, "writer");
            this.file = file;
            this.writer = writer;
        }

        public final File getFile() {
            return this.file;
        }

        public final ProtoStreamWriting2<E> getWriter() {
            return this.writer;
        }
    }
}
