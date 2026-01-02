package wsb.po.osiem.wp.singleton;

public enum SingletonEnum {

	SINGLETON_ENUM_INSTANCE;

	@Override
	public String toString() {
		return "SingletonEnum{}";
	}
}

// The singleton instance can be accessed via "SingletonEnum.INSTANCE".