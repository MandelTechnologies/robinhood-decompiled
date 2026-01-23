package com.robinhood.compose.bento.component.rows;

import androidx.compose.p011ui.Modifier;
import com.adjust.sdk.Constants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* compiled from: BentoBaseRowLayout.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0005J\f\u0010\u0002\u001a\u00020\u0003*\u00020\u0003H&J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0003H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoRowScope;", "", "middle", "Landroidx/compose/ui/Modifier;", Constants.REFERRER_API_META, "Slot", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.component.rows.BentoRowScope, reason: use source file name */
/* loaded from: classes15.dex */
public interface BentoBaseRowLayout5 {
    Modifier meta(Modifier modifier);

    Modifier middle(Modifier modifier);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BentoBaseRowLayout.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/rows/BentoRowScope$Slot;", "", "<init>", "(Ljava/lang/String;I)V", "Middle", "Meta", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.compose.bento.component.rows.BentoRowScope$Slot */
    public static final class Slot {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Slot[] $VALUES;
        public static final Slot Middle = new Slot("Middle", 0);
        public static final Slot Meta = new Slot("Meta", 1);

        private static final /* synthetic */ Slot[] $values() {
            return new Slot[]{Middle, Meta};
        }

        public static EnumEntries<Slot> getEntries() {
            return $ENTRIES;
        }

        private Slot(String str, int i) {
        }

        static {
            Slot[] slotArr$values = $values();
            $VALUES = slotArr$values;
            $ENTRIES = EnumEntries2.enumEntries(slotArr$values);
        }

        public static Slot valueOf(String str) {
            return (Slot) Enum.valueOf(Slot.class, str);
        }

        public static Slot[] values() {
            return (Slot[]) $VALUES.clone();
        }
    }
}
