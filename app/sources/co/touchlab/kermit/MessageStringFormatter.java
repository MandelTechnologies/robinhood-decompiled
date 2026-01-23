package co.touchlab.kermit;

import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MessageStringFormatter.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001a\u0010\r\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, m3636d2 = {"Lco/touchlab/kermit/MessageStringFormatter;", "", "formatMessage", "", "severity", "Lco/touchlab/kermit/Severity;", "tag", "Lco/touchlab/kermit/Tag;", "message", "Lco/touchlab/kermit/Message;", "formatMessage-SNKSsE8", "(Lco/touchlab/kermit/Severity;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "formatSeverity", "formatTag", "formatTag-ntQDErM", "(Ljava/lang/String;)Ljava/lang/String;", "kermit-core_debug"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public interface MessageStringFormatter {
    /* renamed from: formatMessage-SNKSsE8 */
    String mo9093formatMessageSNKSsE8(Severity severity, String tag, String message);

    String formatSeverity(Severity severity);

    /* renamed from: formatTag-ntQDErM */
    String mo9094formatTagntQDErM(String tag);

    /* compiled from: MessageStringFormatter.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        public static String formatSeverity(MessageStringFormatter messageStringFormatter, Severity severity) {
            Intrinsics.checkNotNullParameter(severity, "severity");
            StringBuilder sb = new StringBuilder();
            sb.append(severity);
            sb.append(':');
            return sb.toString();
        }

        /* renamed from: formatTag-ntQDErM, reason: not valid java name */
        public static String m9097formatTagntQDErM(MessageStringFormatter messageStringFormatter, String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            return '(' + tag + ')';
        }

        /* renamed from: formatMessage-SNKSsE8, reason: not valid java name */
        public static String m9096formatMessageSNKSsE8(MessageStringFormatter messageStringFormatter, Severity severity, String str, String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            if (severity == null && str == null) {
                return message;
            }
            StringBuilder sb = new StringBuilder();
            if (severity != null) {
                sb.append(messageStringFormatter.formatSeverity(severity));
                sb.append(PlaceholderUtils.XXShortPlaceholderText);
            }
            if (str != null && str.length() > 0) {
                sb.append(messageStringFormatter.mo9094formatTagntQDErM(str));
                sb.append(PlaceholderUtils.XXShortPlaceholderText);
            }
            sb.append(message);
            String string2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            return string2;
        }
    }
}
