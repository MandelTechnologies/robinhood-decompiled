package operations.logic.equals;

import com.robinhood.shared.security.deviceattestation.DeviceAttestationConstants;
import com.singular.sdk.internal.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import operations.logic.unwrap.SingleNestedValue;

/* compiled from: EqualsTableOfTruth.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0086\u0002J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002¢\u0006\u0002\u0010\fJ\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\n\u001a\u00020\rH\u0002¢\u0006\u0002\u0010\u000eJ\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005*\b\u0012\u0004\u0012\u00020\u00100\u0005H\u0002J\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005*\b\u0012\u0004\u0012\u00020\u00100\u0005H\u0002J\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005*\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0002J\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0005*\b\u0012\u0004\u0012\u00020\u00100\u0005H\u0002R$\u0010\u0003\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Loperations/logic/equals/EqualsTableOfTruth;", "", "()V", "tableOfTruth", "", "", "get", "key", "getAllVariantsOf", "", "value", "", "(D)[Ljava/lang/Object;", "", "(I)[Ljava/lang/Object;", "plusDoubles", "", "plusIntegers", "plusNested", "plusStrings", "Ljava/io/Serializable;", "core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes25.dex */
public final class EqualsTableOfTruth {
    public static final EqualsTableOfTruth INSTANCE;
    private static final Map<Object, List<Object>> tableOfTruth;

    private EqualsTableOfTruth() {
    }

    static {
        EqualsTableOfTruth equalsTableOfTruth = new EqualsTableOfTruth();
        INSTANCE = equalsTableOfTruth;
        Boolean bool = Boolean.TRUE;
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.add(bool);
        spreadBuilder.addSpread(equalsTableOfTruth.getAllVariantsOf(1));
        Tuples2 tuples2M3642to = Tuples4.m3642to(bool, CollectionsKt.listOf(spreadBuilder.toArray(new Object[spreadBuilder.size()])));
        Boolean bool2 = Boolean.FALSE;
        SpreadBuilder spreadBuilder2 = new SpreadBuilder(7);
        spreadBuilder2.add(bool2);
        spreadBuilder2.addSpread(equalsTableOfTruth.getAllVariantsOf(0));
        spreadBuilder2.add("");
        spreadBuilder2.add(CollectionsKt.emptyList());
        spreadBuilder2.add(new SingleNestedValue(CollectionsKt.emptyList()));
        spreadBuilder2.add(new SingleNestedValue(""));
        spreadBuilder2.add(new SingleNestedValue(null));
        Tuples2 tuples2M3642to2 = Tuples4.m3642to(bool2, CollectionsKt.listOf(spreadBuilder2.toArray(new Object[spreadBuilder2.size()])));
        SpreadBuilder spreadBuilder3 = new SpreadBuilder(2);
        spreadBuilder3.add(bool);
        spreadBuilder3.addSpread(equalsTableOfTruth.getAllVariantsOf(1));
        Tuples2 tuples2M3642to3 = Tuples4.m3642to(1, CollectionsKt.listOf(spreadBuilder3.toArray(new Object[spreadBuilder3.size()])));
        SpreadBuilder spreadBuilder4 = new SpreadBuilder(7);
        spreadBuilder4.add(bool2);
        spreadBuilder4.addSpread(equalsTableOfTruth.getAllVariantsOf(0));
        spreadBuilder4.add("");
        spreadBuilder4.add(CollectionsKt.emptyList());
        spreadBuilder4.add(new SingleNestedValue(CollectionsKt.emptyList()));
        spreadBuilder4.add(new SingleNestedValue(""));
        spreadBuilder4.add(new SingleNestedValue(null));
        Tuples2 tuples2M3642to4 = Tuples4.m3642to(0, CollectionsKt.listOf(spreadBuilder4.toArray(new Object[spreadBuilder4.size()])));
        Tuples2 tuples2M3642to5 = Tuples4.m3642to("true", CollectionsKt.listOf("true"));
        Tuples2 tuples2M3642to6 = Tuples4.m3642to("false", CollectionsKt.listOf("false"));
        Double dValueOf = Double.valueOf(1.0d);
        Tuples2 tuples2M3642to7 = Tuples4.m3642to(Constants.SdidMigrationStatusCodes.ALREADY_SDID, CollectionsKt.listOf(bool, 1, dValueOf, Constants.SdidMigrationStatusCodes.ALREADY_SDID, new SingleNestedValue(1), new SingleNestedValue(dValueOf), new SingleNestedValue(Constants.SdidMigrationStatusCodes.ALREADY_SDID)));
        Double dValueOf2 = Double.valueOf(0.0d);
        Tuples2 tuples2M3642to8 = Tuples4.m3642to("0", CollectionsKt.listOf(bool2, 0, dValueOf2, "0", new SingleNestedValue(0), new SingleNestedValue(dValueOf2), new SingleNestedValue("0")));
        Tuples2 tuples2M3642to9 = Tuples4.m3642to("", CollectionsKt.listOf(bool2, 0, "", CollectionsKt.emptyList(), new SingleNestedValue(CollectionsKt.emptyList()), new SingleNestedValue(""), new SingleNestedValue(null)));
        Tuples2 tuples2M3642to10 = Tuples4.m3642to(null, CollectionsKt.listOf((Object) null));
        Tuples2 tuples2M3642to11 = Tuples4.m3642to(CollectionsKt.emptyList(), CollectionsKt.listOf(bool2, 0, dValueOf2, ""));
        Tuples2 tuples2M3642to12 = Tuples4.m3642to(new SingleNestedValue(null), CollectionsKt.listOf(bool2, 0, dValueOf2, ""));
        Tuples2 tuples2M3642to13 = Tuples4.m3642to(new SingleNestedValue(""), CollectionsKt.listOf(bool2, 0, dValueOf2, ""));
        Tuples2 tuples2M3642to14 = Tuples4.m3642to(new SingleNestedValue(CollectionsKt.emptyList()), CollectionsKt.listOf(bool2, 0, dValueOf2, ""));
        Tuples2 tuples2M3642to15 = Tuples4.m3642to(new SingleNestedValue(0), CollectionsKt.listOf(bool2, 0, dValueOf2, "0"));
        Tuples2 tuples2M3642to16 = Tuples4.m3642to(new SingleNestedValue(1), CollectionsKt.listOf(bool, 1, dValueOf, Constants.SdidMigrationStatusCodes.ALREADY_SDID));
        Tuples2 tuples2M3642to17 = Tuples4.m3642to(new SingleNestedValue(Constants.SdidMigrationStatusCodes.ALREADY_SDID), CollectionsKt.listOf(bool, 1, dValueOf, Constants.SdidMigrationStatusCodes.ALREADY_SDID));
        Tuples2 tuples2M3642to18 = Tuples4.m3642to(new SingleNestedValue("0"), CollectionsKt.listOf(bool2, 0, dValueOf2, "0"));
        Tuples2 tuples2M3642to19 = Tuples4.m3642to(new SingleNestedValue(dValueOf2), CollectionsKt.listOf(bool2, 0, dValueOf2, "0"));
        Tuples2 tuples2M3642to20 = Tuples4.m3642to(new SingleNestedValue(dValueOf), CollectionsKt.listOf(bool, 1, dValueOf, Constants.SdidMigrationStatusCodes.ALREADY_SDID));
        Tuples2 tuples2M3642to21 = Tuples4.m3642to(new SingleNestedValue(DeviceAttestationConstants.DEVICE_ATTEST_VERSION), CollectionsKt.listOf(bool, 1, dValueOf));
        Tuples2 tuples2M3642to22 = Tuples4.m3642to(new SingleNestedValue("0.0"), CollectionsKt.listOf(bool2, 0, dValueOf2));
        Tuples2 tuples2M3642to23 = Tuples4.m3642to(dValueOf, CollectionsKt.listOf(dValueOf, new SingleNestedValue(dValueOf), new SingleNestedValue(1), new SingleNestedValue(DeviceAttestationConstants.DEVICE_ATTEST_VERSION), Constants.SdidMigrationStatusCodes.ALREADY_SDID, 1, bool, DeviceAttestationConstants.DEVICE_ATTEST_VERSION));
        Tuples2 tuples2M3642to24 = Tuples4.m3642to(DeviceAttestationConstants.DEVICE_ATTEST_VERSION, CollectionsKt.listOf(DeviceAttestationConstants.DEVICE_ATTEST_VERSION, dValueOf, 1, bool));
        SpreadBuilder spreadBuilder5 = new SpreadBuilder(4);
        spreadBuilder5.addSpread(equalsTableOfTruth.getAllVariantsOf(0.0d));
        spreadBuilder5.add(bool2);
        spreadBuilder5.add(CollectionsKt.emptyList());
        spreadBuilder5.add(new SingleNestedValue(CollectionsKt.emptyList()));
        tableOfTruth = MapsKt.mapOf(tuples2M3642to, tuples2M3642to2, tuples2M3642to3, tuples2M3642to4, tuples2M3642to5, tuples2M3642to6, tuples2M3642to7, tuples2M3642to8, tuples2M3642to9, tuples2M3642to10, tuples2M3642to11, tuples2M3642to12, tuples2M3642to13, tuples2M3642to14, tuples2M3642to15, tuples2M3642to16, tuples2M3642to17, tuples2M3642to18, tuples2M3642to19, tuples2M3642to20, tuples2M3642to21, tuples2M3642to22, tuples2M3642to23, tuples2M3642to24, Tuples4.m3642to(dValueOf2, CollectionsKt.listOf(spreadBuilder5.toArray(new Object[spreadBuilder5.size()]))), Tuples4.m3642to("0.0", CollectionsKt.listOf("0.0", dValueOf2, 0, bool2)));
    }

    public final List<Object> get(Object key) {
        return tableOfTruth.get(key);
    }

    private final Object[] getAllVariantsOf(int value) {
        return plusNested(plusStrings(plusDoubles(CollectionsKt.listOf(Integer.valueOf(value))))).toArray(new Object[0]);
    }

    private final Object[] getAllVariantsOf(double value) {
        return plusNested(plusStrings(plusIntegers(CollectionsKt.listOf(Double.valueOf(value))))).toArray(new Object[0]);
    }

    private final List<Object> plusNested(List<? extends Object> list) {
        List<? extends Object> list2 = list;
        List<? extends Object> list3 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(new SingleNestedValue(it.next()));
        }
        return CollectionsKt.plus((Collection) list2, (Iterable) arrayList);
    }

    private final List<Number> plusDoubles(List<? extends Number> list) {
        List<? extends Number> list2 = list;
        List<? extends Number> list3 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(((Number) it.next()).doubleValue()));
        }
        return CollectionsKt.plus((Collection) list2, (Iterable) arrayList);
    }

    private final List<Number> plusIntegers(List<? extends Number> list) {
        List<? extends Number> list2 = list;
        List<? extends Number> list3 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((Number) it.next()).intValue()));
        }
        return CollectionsKt.plus((Collection) list2, (Iterable) arrayList);
    }

    private final List<Serializable> plusStrings(List<? extends Number> list) {
        List<? extends Number> list2 = list;
        List<? extends Number> list3 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((Number) it.next()).toString());
        }
        return CollectionsKt.plus((Collection) list2, (Iterable) arrayList);
    }
}
