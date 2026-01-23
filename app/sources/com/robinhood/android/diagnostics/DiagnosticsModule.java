package com.robinhood.android.diagnostics;

import com.robinhood.android.diagnostics.annotation.DiagnosticsBytesAdapter;
import com.robinhood.android.diagnostics.annotation.DiagnosticsDirectory;
import com.robinhood.android.diagnostics.p100io.EncryptedBytesAdapter;
import com.robinhood.android.diagnostics.p100io.GzipBytesAdapter;
import com.robinhood.utils.dagger.annotation.FilesDirectory;
import com.squareup.wire.ProtoAdapter;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* compiled from: DiagnosticsModule.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u0007J\u001b\u0010\u0007\u001a\r\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/diagnostics/DiagnosticsModule;", "", "<init>", "()V", "provideDiagnosticsDirectory", "Ljava/io/File;", "filesDirectory", "provideDiagnosticsBytesAdapter", "Lcom/squareup/wire/ProtoAdapter;", "Lokio/ByteString;", "Lkotlin/jvm/JvmWildcard;", "encryptedBytesAdapter", "Lcom/robinhood/android/diagnostics/io/EncryptedBytesAdapter;", "lib-diagnostics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class DiagnosticsModule {
    public static final DiagnosticsModule INSTANCE = new DiagnosticsModule();

    private DiagnosticsModule() {
    }

    @DiagnosticsDirectory
    public final File provideDiagnosticsDirectory(@FilesDirectory File filesDirectory) {
        Intrinsics.checkNotNullParameter(filesDirectory, "filesDirectory");
        return new File(filesDirectory, "diagnostics");
    }

    @DiagnosticsBytesAdapter
    public final ProtoAdapter<ByteString> provideDiagnosticsBytesAdapter(EncryptedBytesAdapter encryptedBytesAdapter) {
        Intrinsics.checkNotNullParameter(encryptedBytesAdapter, "encryptedBytesAdapter");
        return new GzipBytesAdapter(encryptedBytesAdapter);
    }
}
