package com.robinhood.microgram.sdui;

import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ObjectSerializer;
import microgram.p507ui.core.screen.CustomScreenEventCoordinator;

/* compiled from: MicrogramScreenEventMessages.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\u000fJ\t\u0010\u0010\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/ListScreenReachedEndMessage;", "Lmicrogram/ui/core/screen/CustomScreenEvent;", "<init>", "()V", "eventDestination", "", "getEventDestination", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "serializer", "Lkotlinx/serialization/KSerializer;", "toString", "feature-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable
/* renamed from: com.robinhood.microgram.sdui.ListScreenReachedEndMessage, reason: use source file name */
/* loaded from: classes13.dex */
public final /* data */ class MicrogramScreenEventMessages5 implements CustomScreenEventCoordinator {
    public static final int $stable = 0;
    public static final MicrogramScreenEventMessages5 INSTANCE = new MicrogramScreenEventMessages5();
    private static final /* synthetic */ Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.microgram.sdui.ListScreenReachedEndMessage$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MicrogramScreenEventMessages5._init_$_anonymous_();
        }
    });

    public boolean equals(Object other) {
        return this == other || (other instanceof MicrogramScreenEventMessages5);
    }

    public int hashCode() {
        return -1191649773;
    }

    public String toString() {
        return "ListScreenReachedEndMessage";
    }

    private MicrogramScreenEventMessages5() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new ObjectSerializer("com.robinhood.microgram.sdui.ListScreenReachedEndMessage", INSTANCE, new Annotation[0]);
    }

    private final /* synthetic */ KSerializer get$cachedSerializer() {
        return $cachedSerializer$delegate.getValue();
    }

    public final KSerializer<MicrogramScreenEventMessages5> serializer() {
        return get$cachedSerializer();
    }

    @Override // microgram.p507ui.core.screen.CustomScreenEventCoordinator
    public String getEventDestination() {
        return "listScreenReachedEnd";
    }
}
