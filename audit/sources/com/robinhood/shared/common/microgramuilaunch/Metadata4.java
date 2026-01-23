package com.robinhood.shared.common.microgramuilaunch;

import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Metadata.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a*\u0010\u0000\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006\u001a$\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\n"}, m3636d2 = {"buildLoggingEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "metadata", "", "", "buildLoggingScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "lib-microgram-ui-launch_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.common.microgramuilaunch.MetadataKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class Metadata4 {
    public static final Context buildLoggingEventContext(LazyMoshi moshi, Map<String, String> metadata) {
        Object objM28550constructorimpl;
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Types types = Types.INSTANCE;
        JsonAdapter jsonAdapterAdapter = moshi.adapter(new TypeToken<Context>() { // from class: com.robinhood.shared.common.microgramuilaunch.MetadataKt$buildLoggingEventContext$$inlined$getAdapter$1
        }.getType());
        try {
            Result.Companion companion = Result.INSTANCE;
            String str = metadata.get("user_interaction_event_context");
            objM28550constructorimpl = Result.m28550constructorimpl(str != null ? (Context) jsonAdapterAdapter.fromJson(str) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            CrashReporter.INSTANCE.reportNonFatal(thM28553exceptionOrNullimpl, true, new EventMetadata(SentryTeam.ENGAGEMENT, null, null, 6, null));
        }
        return (Context) (Result.m28555isFailureimpl(objM28550constructorimpl) ? null : objM28550constructorimpl);
    }

    public static final Screen buildLoggingScreen(LazyMoshi moshi, Map<String, String> metadata) {
        Object objM28550constructorimpl;
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Types types = Types.INSTANCE;
        JsonAdapter jsonAdapterAdapter = moshi.adapter(new TypeToken<Screen>() { // from class: com.robinhood.shared.common.microgramuilaunch.MetadataKt$buildLoggingScreen$$inlined$getAdapter$1
        }.getType());
        try {
            Result.Companion companion = Result.INSTANCE;
            String str = metadata.get("user_interaction_event_screen");
            objM28550constructorimpl = Result.m28550constructorimpl(str != null ? (Screen) jsonAdapterAdapter.fromJson(str) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            CrashReporter.INSTANCE.reportNonFatal(thM28553exceptionOrNullimpl, true, new EventMetadata(SentryTeam.ENGAGEMENT, null, null, 6, null));
        }
        return (Screen) (Result.m28555isFailureimpl(objM28550constructorimpl) ? null : objM28550constructorimpl);
    }
}
