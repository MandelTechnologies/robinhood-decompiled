package identi.service.p471v1.models_workflow.p472v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FreezeAccount.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m3636d2 = {"identi/service/v1/models_workflow/v1/FreezeAccount$Callback", "Lcom/squareup/wire/WireEnum;", "", "Lidenti/service/v1/models_workflow/v1/FreezeAccount$Callback;", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "CALLBACK_UNSPECIFIED", "EXIT", "ACTION", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class FreezeAccount$Callback implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FreezeAccount$Callback[] $VALUES;
    public static final FreezeAccount$Callback ACTION;

    @JvmField
    public static final ProtoAdapter<FreezeAccount$Callback> ADAPTER;
    public static final FreezeAccount$Callback CALLBACK_UNSPECIFIED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final FreezeAccount$Callback EXIT;
    private final int value;

    private static final /* synthetic */ FreezeAccount$Callback[] $values() {
        return new FreezeAccount$Callback[]{CALLBACK_UNSPECIFIED, EXIT, ACTION};
    }

    @JvmStatic
    public static final FreezeAccount$Callback fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<FreezeAccount$Callback> getEntries() {
        return $ENTRIES;
    }

    private FreezeAccount$Callback(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final FreezeAccount$Callback freezeAccount$Callback = new FreezeAccount$Callback("CALLBACK_UNSPECIFIED", 0, 0);
        CALLBACK_UNSPECIFIED = freezeAccount$Callback;
        EXIT = new FreezeAccount$Callback("EXIT", 1, 1);
        ACTION = new FreezeAccount$Callback("ACTION", 2, 2);
        FreezeAccount$Callback[] freezeAccount$CallbackArr$values = $values();
        $VALUES = freezeAccount$CallbackArr$values;
        $ENTRIES = EnumEntries2.enumEntries(freezeAccount$CallbackArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FreezeAccount$Callback.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<FreezeAccount$Callback>(orCreateKotlinClass, syntax, freezeAccount$Callback) { // from class: identi.service.v1.models_workflow.v1.FreezeAccount$Callback$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public FreezeAccount$Callback fromValue(int value) {
                return FreezeAccount$Callback.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: FreezeAccount.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/FreezeAccount$Callback$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lidenti/service/v1/models_workflow/v1/FreezeAccount$Callback;", "fromValue", "value", "", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FreezeAccount$Callback fromValue(int value) {
            if (value == 0) {
                return FreezeAccount$Callback.CALLBACK_UNSPECIFIED;
            }
            if (value == 1) {
                return FreezeAccount$Callback.EXIT;
            }
            if (value != 2) {
                return null;
            }
            return FreezeAccount$Callback.ACTION;
        }
    }

    public static FreezeAccount$Callback valueOf(String str) {
        return (FreezeAccount$Callback) Enum.valueOf(FreezeAccount$Callback.class, str);
    }

    public static FreezeAccount$Callback[] values() {
        return (FreezeAccount$Callback[]) $VALUES.clone();
    }
}
