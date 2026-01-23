package com.squareup.workflow1;

import java.io.EOFException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMapping;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KAnnotatedElement;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import okio.Buffer;
import okio.ByteString;

/* compiled from: WorkflowIdentifier.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000  2\u00020\u0001:\u0001 B1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0000\u0012\u0012\b\u0002\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u001e\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u001b\u0010\u001c\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00000\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, m3636d2 = {"Lcom/squareup/workflow1/WorkflowIdentifier;", "", "Lkotlin/reflect/KAnnotatedElement;", "type", "proxiedIdentifier", "Lkotlin/Function0;", "", "description", "<init>", "(Lkotlin/reflect/KAnnotatedElement;Lcom/squareup/workflow1/WorkflowIdentifier;Lkotlin/jvm/functions/Function0;)V", "Lokio/ByteString;", "toByteStringOrNull", "()Lokio/ByteString;", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlin/reflect/KAnnotatedElement;", "Lcom/squareup/workflow1/WorkflowIdentifier;", "Lkotlin/jvm/functions/Function0;", "typeName$delegate", "Lkotlin/Lazy;", "getTypeName", "typeName", "Lkotlin/sequences/Sequence;", "proxiedIdentifiers", "Lkotlin/sequences/Sequence;", "Companion", "wf1-workflow-core"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class WorkflowIdentifier {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Function0<String> description;
    private final WorkflowIdentifier proxiedIdentifier;
    private final Sequence<WorkflowIdentifier> proxiedIdentifiers;
    private final KAnnotatedElement type;

    /* renamed from: typeName$delegate, reason: from kotlin metadata */
    private final Lazy typeName;

    public WorkflowIdentifier(KAnnotatedElement type2, WorkflowIdentifier workflowIdentifier, Function0<String> function0) {
        Intrinsics.checkNotNullParameter(type2, "type");
        this.type = type2;
        this.proxiedIdentifier = workflowIdentifier;
        this.description = function0;
        if (!(type2 instanceof KClass) && (!(type2 instanceof KType) || !(((KType) type2).getClassifier() instanceof KClass))) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("Expected type to be either a KClass or a KType with a KClass classifier, but was ", type2).toString());
        }
        this.typeName = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<String>() { // from class: com.squareup.workflow1.WorkflowIdentifier$typeName$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return this.this$0.type instanceof KClass ? JvmClassMapping.getJavaClass((KClass) this.this$0.type).getName() : this.this$0.type.toString();
            }
        });
        this.proxiedIdentifiers = SequencesKt.generateSequence(this, new Function1<WorkflowIdentifier, WorkflowIdentifier>() { // from class: com.squareup.workflow1.WorkflowIdentifier$proxiedIdentifiers$1
            @Override // kotlin.jvm.functions.Function1
            public final WorkflowIdentifier invoke(WorkflowIdentifier it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.proxiedIdentifier;
            }
        });
    }

    public /* synthetic */ WorkflowIdentifier(KAnnotatedElement kAnnotatedElement, WorkflowIdentifier workflowIdentifier, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(kAnnotatedElement, (i & 2) != 0 ? null : workflowIdentifier, (i & 4) != 0 ? null : function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getTypeName() {
        Object value = this.typeName.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-typeName>(...)");
        return (String) value;
    }

    public final ByteString toByteStringOrNull() {
        ByteString byteString = null;
        if (!(this.type instanceof KClass)) {
            return null;
        }
        WorkflowIdentifier workflowIdentifier = this.proxiedIdentifier;
        if (workflowIdentifier != null) {
            ByteString byteStringOrNull = workflowIdentifier.toByteStringOrNull();
            if (byteStringOrNull == null) {
                return null;
            }
            byteString = byteStringOrNull;
        }
        Buffer buffer = new Buffer();
        Snapshots.writeUtf8WithLength(buffer, getTypeName());
        if (byteString != null) {
            buffer.writeByte(1);
            buffer.write(byteString);
        } else {
            buffer.writeByte(0);
        }
        return buffer.readByteString();
    }

    public String toString() {
        Function0<String> function0 = this.description;
        String strInvoke = function0 == null ? null : function0.invoke();
        if (strInvoke != null) {
            return strInvoke;
        }
        return "WorkflowIdentifier(" + SequencesKt.joinToString$default(this.proxiedIdentifiers, null, null, null, 0, null, new Function1<WorkflowIdentifier, CharSequence>() { // from class: com.squareup.workflow1.WorkflowIdentifier.toString.1
            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(WorkflowIdentifier it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getTypeName();
            }
        }, 31, null) + ')';
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkflowIdentifier)) {
            return false;
        }
        WorkflowIdentifier workflowIdentifier = (WorkflowIdentifier) other;
        return Intrinsics.areEqual(this.type, workflowIdentifier.type) && Intrinsics.areEqual(this.proxiedIdentifier, workflowIdentifier.proxiedIdentifier);
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        WorkflowIdentifier workflowIdentifier = this.proxiedIdentifier;
        return iHashCode + (workflowIdentifier == null ? 0 : workflowIdentifier.hashCode());
    }

    /* compiled from: WorkflowIdentifier.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/squareup/workflow1/WorkflowIdentifier$Companion;", "", "()V", "NO_PROXY_IDENTIFIER_TAG", "", "PROXY_IDENTIFIER_TAG", "parse", "Lcom/squareup/workflow1/WorkflowIdentifier;", "bytes", "Lokio/ByteString;", "wf1-workflow-core"}, m3637k = 1, m3638mv = {1, 6, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final WorkflowIdentifier parse(ByteString bytes) {
            WorkflowIdentifier workflowIdentifier;
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            Buffer buffer = new Buffer();
            buffer.write(bytes);
            try {
                String utf8WithLength = Snapshots.readUtf8WithLength(buffer);
                byte b = buffer.readByte();
                if (b == 0) {
                    workflowIdentifier = null;
                } else if (b == 1) {
                    workflowIdentifier = WorkflowIdentifier.INSTANCE.parse(buffer.readByteString());
                } else {
                    throw new IllegalArgumentException("Invalid WorkflowIdentifier");
                }
                return new WorkflowIdentifier(JvmClassMapping.getKotlinClass(Class.forName(utf8WithLength)), workflowIdentifier, null, 4, null);
            } catch (EOFException unused) {
                throw new IllegalArgumentException("Invalid WorkflowIdentifier");
            }
        }
    }
}
