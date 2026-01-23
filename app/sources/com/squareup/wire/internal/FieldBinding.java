package com.squareup.wire.internal;

import com.squareup.wire.KotlinConstructorBuilder;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMapping;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import kotlin.text.Regex;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: FieldBinding.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 D*\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0002*\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005:\u0001DBI\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\t\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J0\u00108\u001a\u0016\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00010+\u0012\u0004\u0012\u00020,0*2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J*\u00109\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00010+0.2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J$\u0010:\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010+0.2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002J\u001d\u0010;\u001a\u00020,2\u0006\u0010<\u001a\u00028\u00012\u0006\u0010;\u001a\u00020+H\u0016¢\u0006\u0002\u0010=J\u001f\u0010>\u001a\u00020,2\u0006\u0010<\u001a\u00028\u00012\b\u0010;\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0002\u0010=J\u0018\u0010?\u001a\u0004\u0018\u00010+2\u0006\u0010@\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010AJ\u0017\u0010B\u001a\u0004\u0018\u00010+2\u0006\u0010<\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010CR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0014\u0010!\u001a\u00020\"X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0014R\"\u0010)\u001a\u0016\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00010+\u0012\u0004\u0012\u00020,0*X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010-\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00010+0.X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010/\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010+0.X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u00100\u001a\u0006\u0012\u0002\b\u0003018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0018\u00104\u001a\u0006\u0012\u0002\b\u0003018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00103R\u0014\u00106\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u0014R\u0014\u00107\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u0014¨\u0006E"}, m3636d2 = {"Lcom/squareup/wire/internal/FieldBinding;", "M", "Lcom/squareup/wire/Message;", "B", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/wire/internal/FieldOrOneOfBinding;", "wireField", "Lcom/squareup/wire/WireField;", "messageType", "Ljava/lang/Class;", "messageField", "Ljava/lang/reflect/Field;", "builderType", "writeIdentityValues", "", "classLoader", "Ljava/lang/ClassLoader;", "<init>", "(Lcom/squareup/wire/WireField;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/Class;ZLjava/lang/ClassLoader;)V", "getWriteIdentityValues", "()Z", AnnotatedPrivateKey.LABEL, "Lcom/squareup/wire/WireField$Label;", "getLabel", "()Lcom/squareup/wire/WireField$Label;", "name", "", "getName", "()Ljava/lang/String;", "wireFieldJsonName", "getWireFieldJsonName", "declaredName", "getDeclaredName", "tag", "", "getTag", "()I", "keyAdapterString", "adapterString", "redacted", "getRedacted", "builderSetter", "Lkotlin/Function2;", "", "", "builderGetter", "Lkotlin/Function1;", "instanceGetter", "keyAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getKeyAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "singleAdapter", "getSingleAdapter", "isMap", "isMessage", "getBuilderSetter", "getBuilderGetter", "getInstanceGetter", "value", "builder", "(Lcom/squareup/wire/Message$Builder;Ljava/lang/Object;)V", "set", "get", "message", "(Lcom/squareup/wire/Message;)Ljava/lang/Object;", "getFromBuilder", "(Lcom/squareup/wire/Message$Builder;)Ljava/lang/Object;", "Companion", "wire-runtime"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class FieldBinding<M extends Message<M, B>, B extends Message.Builder<M, B>> extends FieldOrOneOfBinding<M, B> {
    private static final Regex IS_GETTER_FIELD_NAME_REGEX = new Regex("^is[^a-z].*$");
    private final String adapterString;
    private final Function1<B, Object> builderGetter;
    private final Function2<B, Object, Unit> builderSetter;
    private final ClassLoader classLoader;
    private final String declaredName;
    private final Function1<M, Object> instanceGetter;
    private final String keyAdapterString;
    private final WireField.Label label;
    private final Field messageField;
    private final String name;
    private final boolean redacted;
    private final int tag;
    private final String wireFieldJsonName;
    private final boolean writeIdentityValues;

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public boolean getWriteIdentityValues() {
        return this.writeIdentityValues;
    }

    public /* synthetic */ FieldBinding(WireField wireField, Class cls, Field field, Class cls2, boolean z, ClassLoader classLoader, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(wireField, cls, field, cls2, z, (i & 32) != 0 ? cls.getClassLoader() : classLoader);
    }

    public FieldBinding(WireField wireField, Class<M> messageType, Field messageField, Class<B> builderType, boolean z, ClassLoader classLoader) {
        String strDeclaredName;
        Intrinsics.checkNotNullParameter(wireField, "wireField");
        Intrinsics.checkNotNullParameter(messageType, "messageType");
        Intrinsics.checkNotNullParameter(messageField, "messageField");
        Intrinsics.checkNotNullParameter(builderType, "builderType");
        this.messageField = messageField;
        this.writeIdentityValues = z;
        this.classLoader = classLoader;
        this.label = wireField.label();
        String name = messageField.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        this.name = name;
        this.wireFieldJsonName = wireField.jsonName();
        if (wireField.declaredName().length() == 0) {
            strDeclaredName = messageField.getName();
            Intrinsics.checkNotNullExpressionValue(strDeclaredName, "getName(...)");
        } else {
            strDeclaredName = wireField.declaredName();
        }
        this.declaredName = strDeclaredName;
        this.tag = wireField.tag();
        this.keyAdapterString = wireField.keyAdapter();
        this.adapterString = wireField.adapter();
        this.redacted = wireField.redacted();
        this.builderSetter = getBuilderSetter(builderType, wireField);
        this.builderGetter = getBuilderGetter(builderType, wireField);
        this.instanceGetter = getInstanceGetter(messageType);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public WireField.Label getLabel() {
        return this.label;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public String getName() {
        return this.name;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public String getWireFieldJsonName() {
        return this.wireFieldJsonName;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public String getDeclaredName() {
        return this.declaredName;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public int getTag() {
        return this.tag;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public boolean getRedacted() {
        return this.redacted;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public ProtoAdapter<?> getKeyAdapter() {
        return ProtoAdapter.INSTANCE.get(this.keyAdapterString, this.classLoader);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public ProtoAdapter<?> getSingleAdapter() {
        return ProtoAdapter.INSTANCE.get(this.adapterString, this.classLoader);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public boolean isMap() {
        return this.keyAdapterString.length() > 0;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public boolean isMessage() {
        KClass<?> type2 = getSingleAdapter().getType();
        Class javaObjectType = type2 != null ? JvmClassMapping.getJavaObjectType(type2) : null;
        Intrinsics.checkNotNull(javaObjectType);
        return Message.class.isAssignableFrom(javaObjectType);
    }

    private final Function2<B, Object, Unit> getBuilderSetter(Class<?> builderType, final WireField wireField) throws NoSuchFieldException, NoSuchMethodException, SecurityException {
        if (builderType.isAssignableFrom(KotlinConstructorBuilder.class)) {
            return new Function2() { // from class: com.squareup.wire.internal.FieldBinding$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FieldBinding.getBuilderSetter$lambda$0(wireField, (Message.Builder) obj, obj2);
                }
            };
        }
        if (wireField.label().isOneOf()) {
            Class<?> type2 = this.messageField.getType();
            try {
                final Method method = builderType.getMethod(getName(), type2);
                return new Function2() { // from class: com.squareup.wire.internal.FieldBinding$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return FieldBinding.getBuilderSetter$lambda$1(method, (Message.Builder) obj, obj2);
                    }
                };
            } catch (NoSuchMethodException unused) {
                throw new AssertionError("No builder method " + builderType.getName() + '.' + getName() + '(' + type2.getName() + ')');
            }
        }
        try {
            final Field field = builderType.getField(getName());
            return new Function2() { // from class: com.squareup.wire.internal.FieldBinding$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FieldBinding.getBuilderSetter$lambda$2(field, (Message.Builder) obj, obj2);
                }
            };
        } catch (NoSuchFieldException unused2) {
            throw new AssertionError("No builder field " + builderType.getName() + '.' + getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getBuilderSetter$lambda$0(WireField wireField, Message.Builder builder, Object obj) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        ((KotlinConstructorBuilder) builder).set(wireField, obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getBuilderSetter$lambda$1(Method method, Message.Builder builder, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(builder, "builder");
        method.invoke(builder, obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getBuilderSetter$lambda$2(Field field, Message.Builder builder, Object obj) throws IllegalAccessException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(builder, "builder");
        field.set(builder, obj);
        return Unit.INSTANCE;
    }

    private final Function1<B, Object> getBuilderGetter(Class<?> builderType, final WireField wireField) throws NoSuchFieldException {
        if (builderType.isAssignableFrom(KotlinConstructorBuilder.class)) {
            return new Function1() { // from class: com.squareup.wire.internal.FieldBinding$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FieldBinding.getBuilderGetter$lambda$3(wireField, (Message.Builder) obj);
                }
            };
        }
        try {
            final Field field = builderType.getField(getName());
            return new Function1() { // from class: com.squareup.wire.internal.FieldBinding$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FieldBinding.getBuilderGetter$lambda$4(field, (Message.Builder) obj);
                }
            };
        } catch (NoSuchFieldException unused) {
            throw new AssertionError("No builder field " + builderType.getName() + '.' + getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getBuilderGetter$lambda$3(WireField wireField, Message.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return ((KotlinConstructorBuilder) builder).get(wireField);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getBuilderGetter$lambda$4(Field field, Message.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return field.get(builder);
    }

    private final Function1<M, Object> getInstanceGetter(Class<M> messageType) throws NoSuchMethodException, SecurityException {
        if (Modifier.isPrivate(this.messageField.getModifiers())) {
            String name = this.messageField.getName();
            Regex regex = IS_GETTER_FIELD_NAME_REGEX;
            Intrinsics.checkNotNull(name);
            if (!regex.matches(name)) {
                StringBuilder sb = new StringBuilder();
                sb.append("get");
                if (name.length() > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    String strValueOf = String.valueOf(name.charAt(0));
                    Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
                    String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    sb2.append((Object) upperCase);
                    String strSubstring = name.substring(1);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    sb2.append(strSubstring);
                    name = sb2.toString();
                }
                sb.append(name);
                name = sb.toString();
            }
            final Method method = messageType.getMethod(name, null);
            return new Function1() { // from class: com.squareup.wire.internal.FieldBinding$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FieldBinding.getInstanceGetter$lambda$6(method, (Message) obj);
                }
            };
        }
        return new Function1() { // from class: com.squareup.wire.internal.FieldBinding$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FieldBinding.getInstanceGetter$lambda$7(this.f$0, (Message) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getInstanceGetter$lambda$6(Method method, Message instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        return method.invoke(instance, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getInstanceGetter$lambda$7(FieldBinding fieldBinding, Message instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        return fieldBinding.messageField.get(instance);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public void value(B builder, Object value) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(value, "value");
        if (getLabel().isRepeated()) {
            Object fromBuilder = getFromBuilder((FieldBinding<M, B>) builder);
            if (TypeIntrinsics.isMutableList(fromBuilder)) {
                Intrinsics.checkNotNull(fromBuilder, "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Any>");
                TypeIntrinsics.asMutableList(fromBuilder).add(value);
                return;
            } else if (fromBuilder instanceof List) {
                List mutableList = CollectionsKt.toMutableList((Collection) fromBuilder);
                mutableList.add(value);
                set((FieldBinding<M, B>) builder, (Object) mutableList);
                return;
            } else {
                throw new ClassCastException("Expected a list type, got " + (fromBuilder != null ? fromBuilder.getClass() : null) + '.');
            }
        }
        if (this.keyAdapterString.length() > 0) {
            Object fromBuilder2 = getFromBuilder((FieldBinding<M, B>) builder);
            if (TypeIntrinsics.isMutableMap(fromBuilder2)) {
                ((Map) fromBuilder2).putAll((Map) value);
                return;
            }
            if (fromBuilder2 instanceof Map) {
                Map mutableMap = MapsKt.toMutableMap((Map) fromBuilder2);
                mutableMap.putAll((Map) value);
                set((FieldBinding<M, B>) builder, (Object) mutableMap);
                return;
            } else {
                throw new ClassCastException("Expected a map type, got " + (fromBuilder2 != null ? fromBuilder2.getClass() : null) + '.');
            }
        }
        set((FieldBinding<M, B>) builder, value);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public void set(B builder, Object value) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.builderSetter.invoke(builder, value);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public Object get(M message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return this.instanceGetter.invoke(message);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public Object getFromBuilder(B builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return this.builderGetter.invoke(builder);
    }
}
