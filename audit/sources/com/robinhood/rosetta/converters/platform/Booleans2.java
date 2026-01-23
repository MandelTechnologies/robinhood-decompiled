package com.robinhood.rosetta.converters.platform;

import com.robinhood.rosetta.eventlogging.Boolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Booleans.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u00060\u0001j\u0002`\u0003*\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005*\n\u0010\u0000\"\u00020\u00012\u00020\u0001¨\u0006\u0006"}, m3636d2 = {"ProtobufBoolean", "Lcom/robinhood/rosetta/eventlogging/Boolean;", "toProtobuf", "Lcom/robinhood/rosetta/converters/platform/ProtobufBoolean;", "", "(Ljava/lang/Boolean;)Lcom/robinhood/rosetta/eventlogging/Boolean;", "lib-rosetta-converters_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.rosetta.converters.platform.BooleansKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class Booleans2 {
    public static final Boolean toProtobuf(Boolean bool) {
        return Intrinsics.areEqual(bool, Boolean.TRUE) ? Boolean.TRUE : Intrinsics.areEqual(bool, Boolean.FALSE) ? Boolean.FALSE : Boolean.BOOLEAN_UNSPECIFIED;
    }
}
