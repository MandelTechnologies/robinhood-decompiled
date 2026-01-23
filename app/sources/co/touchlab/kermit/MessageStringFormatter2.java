package co.touchlab.kermit;

import co.touchlab.kermit.MessageStringFormatter;
import kotlin.Metadata;

/* compiled from: MessageStringFormatter.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lco/touchlab/kermit/DefaultFormatter;", "Lco/touchlab/kermit/MessageStringFormatter;", "()V", "kermit-core_debug"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: co.touchlab.kermit.DefaultFormatter, reason: use source file name */
/* loaded from: classes16.dex */
public final class MessageStringFormatter2 implements MessageStringFormatter {
    public static final MessageStringFormatter2 INSTANCE = new MessageStringFormatter2();

    private MessageStringFormatter2() {
    }

    @Override // co.touchlab.kermit.MessageStringFormatter
    /* renamed from: formatMessage-SNKSsE8, reason: not valid java name */
    public String mo9093formatMessageSNKSsE8(Severity severity, String str, String str2) {
        return MessageStringFormatter.DefaultImpls.m9096formatMessageSNKSsE8(this, severity, str, str2);
    }

    @Override // co.touchlab.kermit.MessageStringFormatter
    public String formatSeverity(Severity severity) {
        return MessageStringFormatter.DefaultImpls.formatSeverity(this, severity);
    }

    @Override // co.touchlab.kermit.MessageStringFormatter
    /* renamed from: formatTag-ntQDErM, reason: not valid java name */
    public String mo9094formatTagntQDErM(String str) {
        return MessageStringFormatter.DefaultImpls.m9097formatTagntQDErM(this, str);
    }
}
