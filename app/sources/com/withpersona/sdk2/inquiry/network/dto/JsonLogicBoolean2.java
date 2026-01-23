package com.withpersona.sdk2.inquiry.network.dto;

import defpackage.JsonLogicEngine;
import defpackage.OperationsProvider;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: JsonLogicBoolean.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001b\u0010\u0000\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m3636d2 = {"jsonLogicEngine", "LJsonLogicEngine;", "getJsonLogicEngine", "()LJsonLogicEngine;", "jsonLogicEngine$delegate", "Lkotlin/Lazy;", "network-inquiry_release"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.network.dto.JsonLogicBooleanKt, reason: use source file name */
/* loaded from: classes18.dex */
public final class JsonLogicBoolean2 {
    private static final Lazy jsonLogicEngine$delegate = LazyKt.lazy(new Function0() { // from class: com.withpersona.sdk2.inquiry.network.dto.JsonLogicBooleanKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return JsonLogicBoolean2.jsonLogicEngine_delegate$lambda$0();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonLogicEngine getJsonLogicEngine() {
        return (JsonLogicEngine) jsonLogicEngine$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonLogicEngine jsonLogicEngine_delegate$lambda$0() {
        JsonLogicEngine.Builder builder = new JsonLogicEngine.Builder();
        OperationsProvider operationsProvider = OperationsProvider.INSTANCE;
        return builder.addStandardOperations(operationsProvider.getStandardOperations()).addFunctionalOperations(operationsProvider.getFunctionalOperations()).build();
    }
}
