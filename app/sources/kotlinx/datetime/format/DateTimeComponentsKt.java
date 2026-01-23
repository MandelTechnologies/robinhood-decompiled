package kotlinx.datetime.format;

import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.datetime.internal.format.FieldSpec5;
import kotlinx.datetime.internal.format.FieldSpec6;

/* compiled from: DateTimeComponents.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\"&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0014\u0010\u0007\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lkotlinx/datetime/internal/format/GenericFieldSpec;", "Lkotlinx/datetime/format/DateTimeComponentsContents;", "", "timeZoneField", "Lkotlinx/datetime/internal/format/GenericFieldSpec;", "getTimeZoneField", "()Lkotlinx/datetime/internal/format/GenericFieldSpec;", "emptyDateTimeComponentsContents", "Lkotlinx/datetime/format/DateTimeComponentsContents;", "kotlinx-datetime"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class DateTimeComponentsKt {
    private static final FieldSpec5<DateTimeComponentsContents, String> timeZoneField = new FieldSpec5<>(new FieldSpec6(new MutablePropertyReference1Impl() { // from class: kotlinx.datetime.format.DateTimeComponentsKt$timeZoneField$1
        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
        public Object get(Object obj) {
            return ((DateTimeComponentsContents) obj).getTimeZoneId();
        }

        @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
        public void set(Object obj, Object obj2) {
            ((DateTimeComponentsContents) obj).setTimeZoneId((String) obj2);
        }
    }), null, null, null, 14, null);
    private static final DateTimeComponentsContents emptyDateTimeComponentsContents = new DateTimeComponentsContents(null, null, null, null, 15, null);
}
