package external_sort;

import java.io.IOException;
import java.util.Iterator;

/**
 * An {@code InputBuffer} provides access to objects stored in a fixed size byte array.
 * 
 * @author Jeong-Hyon Hwang (jhh@cs.albany.edu)
 */
public class InputBuffer {

	/**
	 * A byte array managed by this {@code InputBuffer}.
	 */
	byte[] buffer;

	/**
	 * Constructs an {@code InputBuffer}.
	 * 
	 * @param bufferSize
	 *            the size of the {@code InputBuffer} (i.e., the size of the byte array managed by the
	 *            {@code OutputBuffer})
	 */
	public InputBuffer(int bufferSize) {
		buffer = new byte[bufferSize];
	}

	/**
	 * Returns the byte array managed by this {@code InputBuffer}.
	 *
	 * @return the byte array managed by this {@code InputBuffer}
	 */
	public byte[] toByteArray() {
		return buffer;
	}

	/**
	 * Returns an {@code Iterator} over the objects stored in the byte array of this {@code InputBuffer}.
	 *
	 * @return an {@code Iterator} over the objects stored in the byte array of this {@code InputBuffer}
	 * @throws IOException
	 *             if an I/O error occurs
	 * @throws ClassNotFoundException
	 *             if the class of a serialized object cannot be found
	 */
	public Iterator<Object> iterator() throws IOException, ClassNotFoundException {
		// TODO complete this method (40 points)
		// ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buffer));
		throw new UnsupportedOperationException();
	}

}
