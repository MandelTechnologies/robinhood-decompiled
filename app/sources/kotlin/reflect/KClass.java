package kotlin.reflect;

import java.util.List;
import kotlin.Metadata;
import kotlin.SinceKotlin;

/* compiled from: KClass.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0011\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0015\u001a\u0004\u0018\u00018\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R(\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00000\u00168&X§\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\u00078&X§\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u00078&X§\u0004¢\u0006\f\u0012\u0004\b \u0010\u001a\u001a\u0004\b\u001f\u0010\u001dR\u001a\u0010!\u001a\u00020\u00078&X§\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u001a\u001a\u0004\b!\u0010\u001dR\u001a\u0010#\u001a\u00020\u00078&X§\u0004¢\u0006\f\u0012\u0004\b$\u0010\u001a\u001a\u0004\b#\u0010\u001dR\u001a\u0010%\u001a\u00020\u00078&X§\u0004¢\u0006\f\u0012\u0004\b&\u0010\u001a\u001a\u0004\b%\u0010\u001d¨\u0006'"}, m3636d2 = {"Lkotlin/reflect/KClass;", "", "T", "Lkotlin/reflect/KDeclarationContainer;", "Lkotlin/reflect/KAnnotatedElement;", "Lkotlin/reflect/KClassifier;", "value", "", "isInstance", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "getSimpleName", "()Ljava/lang/String;", "simpleName", "getQualifiedName", "qualifiedName", "getObjectInstance", "()Ljava/lang/Object;", "objectInstance", "", "getSealedSubclasses", "()Ljava/util/List;", "getSealedSubclasses$annotations", "()V", "sealedSubclasses", "isAbstract", "()Z", "isAbstract$annotations", "isSealed", "isSealed$annotations", "isData", "isData$annotations", "isInner", "isInner$annotations", "isValue", "isValue$annotations", "kotlin-stdlib"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public interface KClass<T> extends KDeclarationContainer, KAnnotatedElement, KClassifier {

    /* compiled from: KClass.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes14.dex */
    public static final class DefaultImpls {
    }

    T getObjectInstance();

    String getQualifiedName();

    List<KClass<? extends T>> getSealedSubclasses();

    String getSimpleName();

    int hashCode();

    boolean isAbstract();

    boolean isData();

    boolean isInner();

    @SinceKotlin
    boolean isInstance(Object value);

    boolean isSealed();

    boolean isValue();
}
