package com.robinhood.android.odyssey.lib.template;

import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SdTemplateState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/SdoState;", "", "<init>", "()V", "Initial", "Loading", "SdoUiEvent", "Lcom/robinhood/android/odyssey/lib/template/SdoState$Initial;", "Lcom/robinhood/android/odyssey/lib/template/SdoState$Loading;", "Lcom/robinhood/android/odyssey/lib/template/SdoState$SdoUiEvent;", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.odyssey.lib.template.SdoState, reason: use source file name */
/* loaded from: classes10.dex */
public abstract class SdTemplateState {
    public static final int $stable = 0;

    public /* synthetic */ SdTemplateState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SdTemplateState() {
    }

    /* compiled from: SdTemplateState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/SdoState$Initial;", "Lcom/robinhood/android/odyssey/lib/template/SdoState;", "<init>", "()V", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.odyssey.lib.template.SdoState$Initial */
    public static final class Initial extends SdTemplateState {
        public static final int $stable = 0;
        public static final Initial INSTANCE = new Initial();

        private Initial() {
            super(null);
        }
    }

    /* compiled from: SdTemplateState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/SdoState$Loading;", "Lcom/robinhood/android/odyssey/lib/template/SdoState;", "<init>", "()V", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.odyssey.lib.template.SdoState$Loading */
    public static final class Loading extends SdTemplateState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    /* compiled from: SdTemplateState.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/SdoState$SdoUiEvent;", "Lcom/robinhood/android/odyssey/lib/template/SdoState;", "eventData", "Lcom/robinhood/android/odyssey/lib/template/SdoUiEventData;", "<init>", "(Lcom/robinhood/android/odyssey/lib/template/SdoUiEventData;)V", "event", "Lcom/robinhood/udf/UiEvent;", "getEvent", "()Lcom/robinhood/udf/UiEvent;", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.odyssey.lib.template.SdoState$SdoUiEvent */
    public static final class SdoUiEvent extends SdTemplateState {
        public static final int $stable = 8;
        private final UiEvent<SdTemplateState2> event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SdoUiEvent(SdTemplateState2 eventData) {
            super(null);
            Intrinsics.checkNotNullParameter(eventData, "eventData");
            this.event = new UiEvent<>(eventData);
        }

        public final UiEvent<SdTemplateState2> getEvent() {
            return this.event;
        }
    }
}
