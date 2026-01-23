package com.robinhood.microgram.sdui;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptions;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import microgram.p507ui.core.screen.CustomScreenEventCoordinator;
import microgram.p507ui.p508v1.screen_events.HtmlCanvasAvailableAreaMessageDto;

/* compiled from: MicrogramScreenEventMessages.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u000eHÖ\u0001J%\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0001¢\u0006\u0002\b R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/HtmlCanvasAvailableAreaMessage;", "Lmicrogram/ui/core/screen/CustomScreenEvent;", "message", "Lmicrogram/ui/v1/screen_events/HtmlCanvasAvailableAreaMessageDto;", "<init>", "(Lmicrogram/ui/v1/screen_events/HtmlCanvasAvailableAreaMessageDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILmicrogram/ui/v1/screen_events/HtmlCanvasAvailableAreaMessageDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getMessage", "()Lmicrogram/ui/v1/screen_events/HtmlCanvasAvailableAreaMessageDto;", "eventDestination", "", "getEventDestination", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$feature_microgram_sdui_externalDebug", "$serializer", "Companion", "feature-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes13.dex */
public final /* data */ class HtmlCanvasAvailableAreaMessage implements CustomScreenEventCoordinator {
    private final HtmlCanvasAvailableAreaMessageDto message;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ HtmlCanvasAvailableAreaMessage copy$default(HtmlCanvasAvailableAreaMessage htmlCanvasAvailableAreaMessage, HtmlCanvasAvailableAreaMessageDto htmlCanvasAvailableAreaMessageDto, int i, Object obj) {
        if ((i & 1) != 0) {
            htmlCanvasAvailableAreaMessageDto = htmlCanvasAvailableAreaMessage.message;
        }
        return htmlCanvasAvailableAreaMessage.copy(htmlCanvasAvailableAreaMessageDto);
    }

    /* renamed from: component1, reason: from getter */
    public final HtmlCanvasAvailableAreaMessageDto getMessage() {
        return this.message;
    }

    public final HtmlCanvasAvailableAreaMessage copy(HtmlCanvasAvailableAreaMessageDto message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new HtmlCanvasAvailableAreaMessage(message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HtmlCanvasAvailableAreaMessage) && Intrinsics.areEqual(this.message, ((HtmlCanvasAvailableAreaMessage) other).message);
    }

    public int hashCode() {
        return this.message.hashCode();
    }

    public String toString() {
        return "HtmlCanvasAvailableAreaMessage(message=" + this.message + ")";
    }

    /* compiled from: MicrogramScreenEventMessages.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/HtmlCanvasAvailableAreaMessage$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/microgram/sdui/HtmlCanvasAvailableAreaMessage;", "feature-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HtmlCanvasAvailableAreaMessage> serializer() {
            return MicrogramScreenEventMessages2.INSTANCE;
        }
    }

    public /* synthetic */ HtmlCanvasAvailableAreaMessage(int i, HtmlCanvasAvailableAreaMessageDto htmlCanvasAvailableAreaMessageDto, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptions.throwMissingFieldException(i, 1, MicrogramScreenEventMessages2.INSTANCE.getDescriptor());
        }
        this.message = htmlCanvasAvailableAreaMessageDto;
    }

    public HtmlCanvasAvailableAreaMessage(HtmlCanvasAvailableAreaMessageDto message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.message = message;
    }

    public final HtmlCanvasAvailableAreaMessageDto getMessage() {
        return this.message;
    }

    @Override // microgram.p507ui.core.screen.CustomScreenEventCoordinator
    public String getEventDestination() {
        return "htmlCanvasAvailableAreaMessage";
    }
}
