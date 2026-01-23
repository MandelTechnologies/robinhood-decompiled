package com.twilio.conversations.extensions;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationsExtensions.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\b\t\n\u000b\fB\u0013\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0005\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/twilio/conversations/extensions/ChannelType;", "", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue$convo_android_release", "()Ljava/lang/String;", "Unset", "Chat", "Sms", "Whatsapp", "Other", "Lcom/twilio/conversations/extensions/ChannelType$Chat;", "Lcom/twilio/conversations/extensions/ChannelType$Other;", "Lcom/twilio/conversations/extensions/ChannelType$Sms;", "Lcom/twilio/conversations/extensions/ChannelType$Unset;", "Lcom/twilio/conversations/extensions/ChannelType$Whatsapp;", "convo-android_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class ChannelType {
    private final String value;

    public /* synthetic */ ChannelType(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* compiled from: ConversationsExtensions.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/twilio/conversations/extensions/ChannelType$Unset;", "Lcom/twilio/conversations/extensions/ChannelType;", "<init>", "()V", "convo-android_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Unset extends ChannelType {
        public static final Unset INSTANCE = new Unset();

        /* JADX WARN: Multi-variable type inference failed */
        private Unset() {
            super(null, 0 == true ? 1 : 0);
        }
    }

    private ChannelType(String str) {
        this.value = str;
    }

    /* renamed from: getValue$convo_android_release, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* compiled from: ConversationsExtensions.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/twilio/conversations/extensions/ChannelType$Chat;", "Lcom/twilio/conversations/extensions/ChannelType;", "<init>", "()V", "convo-android_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Chat extends ChannelType {
        public static final Chat INSTANCE = new Chat();

        private Chat() {
            super("chat", null);
        }
    }

    /* compiled from: ConversationsExtensions.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/twilio/conversations/extensions/ChannelType$Sms;", "Lcom/twilio/conversations/extensions/ChannelType;", "<init>", "()V", "convo-android_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Sms extends ChannelType {
        public static final Sms INSTANCE = new Sms();

        private Sms() {
            super("sms", null);
        }
    }

    /* compiled from: ConversationsExtensions.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/twilio/conversations/extensions/ChannelType$Whatsapp;", "Lcom/twilio/conversations/extensions/ChannelType;", "<init>", "()V", "convo-android_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Whatsapp extends ChannelType {
        public static final Whatsapp INSTANCE = new Whatsapp();

        private Whatsapp() {
            super("whatsapp", null);
        }
    }

    /* compiled from: ConversationsExtensions.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/twilio/conversations/extensions/ChannelType$Other;", "Lcom/twilio/conversations/extensions/ChannelType;", "channel", "", "<init>", "(Ljava/lang/String;)V", "getChannel", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "convo-android_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class Other extends ChannelType {
        private final String channel;

        public static /* synthetic */ Other copy$default(Other other, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = other.channel;
            }
            return other.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getChannel() {
            return this.channel;
        }

        public final Other copy(String channel) {
            Intrinsics.checkNotNullParameter(channel, "channel");
            return new Other(channel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Other) && Intrinsics.areEqual(this.channel, ((Other) other).channel);
        }

        public int hashCode() {
            return this.channel.hashCode();
        }

        public String toString() {
            return "Other(channel=" + this.channel + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Other(String channel) {
            super(channel, null);
            Intrinsics.checkNotNullParameter(channel, "channel");
            this.channel = channel;
        }

        public final String getChannel() {
            return this.channel;
        }
    }
}
