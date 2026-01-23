package microgram.android.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import microgram.Message;

/* compiled from: HostReceiveMessageHandler.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\fJ\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\nH¦@¢\u0006\u0002\u0010\u000b¨\u0006\r"}, m3636d2 = {"Lmicrogram/android/internal/ReplyReceiver;", "", "processReply", "Lmicrogram/android/internal/ReplyReceiver$Status;", "messageId", "", "message", "Lmicrogram/Message;", "(Ljava/lang/String;Lmicrogram/Message;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onInterrupted", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Status", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: microgram.android.internal.ReplyReceiver, reason: use source file name */
/* loaded from: classes14.dex */
public interface HostReceiveMessageHandler4 {
    Object onInterrupted(Continuation<? super Unit> continuation);

    Object processReply(String str, Message message, Continuation<? super Status> continuation);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: HostReceiveMessageHandler.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lmicrogram/android/internal/ReplyReceiver$Status;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_ACCEPTED", "ACCEPTED", "FAILED", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: microgram.android.internal.ReplyReceiver$Status */
    public static final class Status {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status NOT_ACCEPTED = new Status("NOT_ACCEPTED", 0);
        public static final Status ACCEPTED = new Status("ACCEPTED", 1);
        public static final Status FAILED = new Status("FAILED", 2);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{NOT_ACCEPTED, ACCEPTED, FAILED};
        }

        public static EnumEntries<Status> getEntries() {
            return $ENTRIES;
        }

        private Status(String str, int i) {
        }

        static {
            Status[] statusArr$values = $values();
            $VALUES = statusArr$values;
            $ENTRIES = EnumEntries2.enumEntries(statusArr$values);
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }
}
