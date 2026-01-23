package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.protoTypeTableUtil;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;

/* compiled from: ValueClassUtil.kt */
@SourceDebugExtension
/* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.ValueClassUtilKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class ValueClassUtil {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends RigidTypeMarker> ValueClassRepresentation<T> loadValueClassRepresentation(ProtoBuf.Class r1, NameResolver nameResolver, TypeTable typeTable, Function1<? super ProtoBuf.Type, ? extends T> typeDeserializer, Function1<? super Name, ? extends T> typeOfPublicProperty) {
        T tInvoke;
        Intrinsics.checkNotNullParameter(r1, "<this>");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(typeDeserializer, "typeDeserializer");
        Intrinsics.checkNotNullParameter(typeOfPublicProperty, "typeOfPublicProperty");
        if (r1.getMultiFieldValueClassUnderlyingNameCount() > 0) {
            Tuples2<List<Name>, List<ProtoBuf.Type>> tuples2LoadMultiFieldValueClassRepresentation = loadMultiFieldValueClassRepresentation(r1, nameResolver, typeTable);
            List<Name> listComponent1 = tuples2LoadMultiFieldValueClassRepresentation.component1();
            List<ProtoBuf.Type> listComponent2 = tuples2LoadMultiFieldValueClassRepresentation.component2();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listComponent2, 10));
            Iterator<T> it = listComponent2.iterator();
            while (it.hasNext()) {
                arrayList.add(typeDeserializer.invoke(it.next()));
            }
            return new MultiFieldValueClassRepresentation(CollectionsKt.zip(listComponent1, arrayList));
        }
        if (!r1.hasInlineClassUnderlyingPropertyName()) {
            return null;
        }
        Name name = NameResolverUtil.getName(nameResolver, r1.getInlineClassUnderlyingPropertyName());
        ProtoBuf.Type typeInlineClassUnderlyingType = protoTypeTableUtil.inlineClassUnderlyingType(r1, typeTable);
        if ((typeInlineClassUnderlyingType == null || (tInvoke = typeDeserializer.invoke(typeInlineClassUnderlyingType)) == null) && (tInvoke = typeOfPublicProperty.invoke(name)) == null) {
            throw new IllegalStateException(("cannot determine underlying type for value class " + NameResolverUtil.getName(nameResolver, r1.getFqName()) + " with property " + name).toString());
        }
        return new InlineClassRepresentation(name, tInvoke);
    }

    public static final Tuples2<List<Name>, List<ProtoBuf.Type>> loadMultiFieldValueClassRepresentation(ProtoBuf.Class r5, NameResolver nameResolver, TypeTable typeTable) {
        List<ProtoBuf.Type> multiFieldValueClassUnderlyingTypeList;
        Intrinsics.checkNotNullParameter(r5, "<this>");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        List<Integer> multiFieldValueClassUnderlyingNameList = r5.getMultiFieldValueClassUnderlyingNameList();
        Intrinsics.checkNotNullExpressionValue(multiFieldValueClassUnderlyingNameList, "getMultiFieldValueClassUnderlyingNameList(...)");
        List<Integer> list = multiFieldValueClassUnderlyingNameList;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Integer num : list) {
            Intrinsics.checkNotNull(num);
            arrayList.add(NameResolverUtil.getName(nameResolver, num.intValue()));
        }
        Tuples2 tuples2M3642to = Tuples4.m3642to(Integer.valueOf(r5.getMultiFieldValueClassUnderlyingTypeIdCount()), Integer.valueOf(r5.getMultiFieldValueClassUnderlyingTypeCount()));
        if (Intrinsics.areEqual(tuples2M3642to, Tuples4.m3642to(Integer.valueOf(arrayList.size()), 0))) {
            List<Integer> multiFieldValueClassUnderlyingTypeIdList = r5.getMultiFieldValueClassUnderlyingTypeIdList();
            Intrinsics.checkNotNullExpressionValue(multiFieldValueClassUnderlyingTypeIdList, "getMultiFieldValueClassUnderlyingTypeIdList(...)");
            List<Integer> list2 = multiFieldValueClassUnderlyingTypeIdList;
            multiFieldValueClassUnderlyingTypeList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (Integer num2 : list2) {
                Intrinsics.checkNotNull(num2);
                multiFieldValueClassUnderlyingTypeList.add(typeTable.get(num2.intValue()));
            }
        } else {
            if (!Intrinsics.areEqual(tuples2M3642to, Tuples4.m3642to(0, Integer.valueOf(arrayList.size())))) {
                throw new IllegalStateException(("class " + NameResolverUtil.getName(nameResolver, r5.getFqName()) + " has illegal multi-field value class representation").toString());
            }
            multiFieldValueClassUnderlyingTypeList = r5.getMultiFieldValueClassUnderlyingTypeList();
        }
        return Tuples4.m3642to(arrayList, multiFieldValueClassUnderlyingTypeList);
    }
}
